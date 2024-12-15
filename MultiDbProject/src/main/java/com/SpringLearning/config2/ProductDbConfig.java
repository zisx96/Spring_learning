package com.SpringLearning.config2;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="productEntityManager",
transactionManagerRef="productTransactionManager",
basePackages="com.SpringLearning.repo.product")
public class ProductDbConfig {
	
	@Bean
	@ConfigurationProperties(prefix="productdb.datasource")
	@Primary
	public DataSource productDataSource() {
		
		return DataSourceBuilder.create().build();
	}
	
	
	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean productEntityManager(EntityManagerFactoryBuilder emfb) {
		
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl-auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.show-sql", "true");
		
		
		return emfb.dataSource(productDataSource())
				.packages("com.SpringLearning.model.product")
				.properties(properties)
				.persistenceUnit("springmultidb")
				.build();
		
	}
	
	//Trasaction
	@Bean
	@Primary
	public PlatformTransactionManager productTransactionManager(@Qualifier("productEntityManager") EntityManagerFactory factory) {
		
		return new JpaTransactionManager(factory);
		
	}
	
}
