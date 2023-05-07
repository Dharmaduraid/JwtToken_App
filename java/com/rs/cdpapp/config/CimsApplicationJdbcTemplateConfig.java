//package com.rs.cdpapp.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@EnableTransactionManagement
//public class CimsApplicationJdbcTemplateConfig {
//
//	@Value("${spring.datasource.driver.class.oracle}")
//	private String driverClass;
//
//	@Value("${spring.cimsapp.datasource.url}")
//	private String dataSourceUrl;
//
//	@Value("${spring.cimsapp.datasource.username}")
//	private String dataSourceUsername;
//
//	@Value("${spring.cimsapp.datasource.password}")
//	private String dataSourcePassword;
//
//	@Bean
//	public DataSource cimsAppDataSource() {
//		
//		HikariConfig dataSourceConfig = new HikariConfig();
//		dataSourceConfig.setDriverClassName(driverClass);
//		dataSourceConfig.setJdbcUrl(dataSourceUrl);
//		dataSourceConfig.setUsername(dataSourceUsername);
//		dataSourceConfig.setPassword(dataSourcePassword);
//		//dataSourceConfig.setMaximumPoolSize(5);
//		dataSourceConfig.setMaximumPoolSize(2);
//        dataSourceConfig.setConnectionTimeout(300000);//5 Mins
//        dataSourceConfig.setIdleTimeout(180000);//3 Minutes
//        dataSourceConfig.setMinimumIdle(3);
//		return new HikariDataSource(dataSourceConfig);
//	}
//
//	@Bean
//	public JdbcTemplate cimsAppJdbcTemplate() {
//		JdbcTemplate cimsAppJdbcTemplate= new JdbcTemplate(cimsAppDataSource());
//		cimsAppJdbcTemplate.setResultsMapCaseInsensitive(true);
//		return cimsAppJdbcTemplate;
//	}
//
//	@Bean(name = "namedParameterCimsAppJdbcTemplate")
//	public NamedParameterJdbcTemplate namedParameterCimsAppJdbcTemplate() {
//		NamedParameterJdbcTemplate namedParameterCimsAppJdbcTemplate = new NamedParameterJdbcTemplate(cimsAppDataSource());
//		return namedParameterCimsAppJdbcTemplate;
//	}
//
//}
