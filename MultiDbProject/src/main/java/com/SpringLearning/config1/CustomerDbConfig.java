package com.SpringLearning.config1;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="customerEntityManager",
transactionManagerRef="customerTransactionManager",
basePackages="com.SpringLearning.repo.customer")
public class CustomerDbConfig {

	@Bean
	@ConfigurationProperties(prefix="customerdb.datasource")
	public DataSource customerDataSource() {
		
		return DataSourceBuilder.create().build();
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean customerEntityManager(EntityManagerFactoryBuilder emfb) {
		
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl-auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.show-sql", "true");
		
		
		return emfb.dataSource(customerDataSource())
				.packages("com.SpringLearning.model.customer")
				.properties(properties)
				.persistenceUnit("spring_multidb")
				.build();
		
	}
	
	//Trasaction
	@Bean
	public PlatformTransactionManager customerTransactionManager(@Qualifier("customerEntityManager") EntityManagerFactory factory) {
		
		return new JpaTransactionManager(factory);
		
	}
	
}
