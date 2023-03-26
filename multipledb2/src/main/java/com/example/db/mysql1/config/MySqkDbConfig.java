package com.example.db.mysql1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "",
		basePackages = {"com.lcwd.db.mysql.repo"},
		transactionManagerRef = ""
)
public class MySqkDbConfig {
	//database
	
	//entityManagement
	
	//platformTransactionManager
	
}
