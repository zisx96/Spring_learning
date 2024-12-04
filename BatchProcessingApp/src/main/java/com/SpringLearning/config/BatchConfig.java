package com.SpringLearning.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.SpringLearning.dao.ICustomerRepo;
import com.SpringLearning.model.Customer;

@Configuration
public class BatchConfig {

	@Autowired
	private ICustomerRepo repo;
	
	@Autowired
	private JobRepository jobRepo;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	// ItemReader
	@Bean
	public FlatFileItemReader<Customer> itemReader() {
		
		FlatFileItemReader<Customer> reader = new FlatFileItemReader<>();
		reader.setResource(new FileSystemResource("src/main/resources/customer_data.csv"));
		reader.setName("csv-reader");
		reader.setLinesToSkip(1);	// does write header from csv
		reader.setLineMapper(lineMapper());
		return reader;
	}
	
	private LineMapper<Customer> lineMapper() {
		
		DefaultLineMapper lineMapper = new DefaultLineMapper<>();
		
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setDelimiter(",");
		
		tokenizer.setStrict(false);
		tokenizer.setNames("customerID","firstName","lastName","email","phoneNumber","city","state","zipCode","country");
		
		BeanWrapperFieldSetMapper<Customer> beanWrapper = new BeanWrapperFieldSetMapper<>();
		beanWrapper.setTargetType(Customer.class);
		
		lineMapper.setLineTokenizer(tokenizer);
		lineMapper.setFieldSetMapper(beanWrapper);
		
		return lineMapper;
	}

	//ItemProcessor
	@Bean
	public CustomerProcesser ProcessCxData() {
		
		return new CustomerProcesser();
	}
	
	//ItemWriter
	@Bean
	public RepositoryItemWriter<Customer> itemWriter() {
		
		RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<Customer>();
		writer.setRepository(repo);
		writer.setMethodName("save");
		return writer;
		
	}
	
	//Step
	@Bean
	public Step step() {
		
		
		return new StepBuilder("step-1", jobRepo).<Customer,Customer>
					chunk(10, transactionManager)
					.reader(itemReader())
					.processor(ProcessCxData())
					.writer(itemWriter())
					.build();
	}
	
	//Job
	
	@Bean
	public Job job(){
		
		return (Job) new JobBuilder("customer-import", jobRepo)
				.start(step())
				.build();
	}
}
