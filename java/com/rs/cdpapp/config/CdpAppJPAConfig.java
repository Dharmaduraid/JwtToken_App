/**
 * 
 */
package com.rs.cdpapp.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author FAsupport3
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {
		"com.rs.cdpapp.repository" ,"com.rs.cdpapp.config.security.repository"}, entityManagerFactoryRef = "cdpAppEntityManagerFactory", transactionManagerRef = "cdpAppTransactionManager")
public class CdpAppJPAConfig {

	@Value("${spring.datasource.driver.class}")
	private String driverClass;

	@Value("${spring.cdpapp.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.cdpapp.datasource.username}")
	private String dataSourceUsername;

	@Value("${spring.cdpapp.datasource.password}")
	private String dataSourcePassword;

	@Value("${spring.jpa.show-sql}")
	private String jpaShowSql;

	@Value("${spring.jpa.format_sql}")
	private String jpaFormatSql;

	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String dbPlatform;

	@Value("${spring.jpa.database.base.package}")
	private String basePackage;

	
	
	@Bean
	@Primary
	public DataSource cdpAppDataSource() {

		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName(driverClass);
		dataSourceConfig.setJdbcUrl(dataSourceUrl);
		dataSourceConfig.setUsername(dataSourceUsername);
		dataSourceConfig.setPassword(dataSourcePassword);
		dataSourceConfig.setMaximumPoolSize(5);
	    return new HikariDataSource(dataSourceConfig);
		
	}

	@Bean
	@Primary
	public HibernateExceptionTranslator hibernateExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}

	@Bean
	@Primary
	public EntityManagerFactory cdpAppEntityManagerFactory() {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql((jpaShowSql == null ? false : Boolean.valueOf(jpaShowSql)));
		vendorAdapter.setDatabase(Database.ORACLE);
		vendorAdapter.setDatabasePlatform(dbPlatform);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan(basePackage);
		factory.setDataSource(cdpAppDataSource());
		Properties properties = new Properties();

		properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
//		properties.setProperty("hibernate.hbm2ddl.auto", "update");

		// Batch Insert
		properties.setProperty("hibernate.generate_statistics", "false");
		properties.setProperty("hibernate.jdbc.batch_size", "20");
		properties.setProperty("hibernate.order_inserts", "true");

		factory.setJpaProperties(properties);
		factory.afterPropertiesSet();
		return factory.getObject();
	}

	@Bean
	public PlatformTransactionManager cdpAppTransactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
		JpaDialect jpaDialect = new HibernateJpaDialect();
		txManager.setEntityManagerFactory(cdpAppEntityManagerFactory());
		txManager.setJpaDialect(jpaDialect);
		return txManager;
	}

	@Bean
	public JdbcTemplate cdpAppJdbcTemplate() {
		JdbcTemplate cdpAppJdbcTemplate = new JdbcTemplate(cdpAppDataSource());
		cdpAppJdbcTemplate.setResultsMapCaseInsensitive(true);
		return cdpAppJdbcTemplate;
	}

	@Bean
	public NamedParameterJdbcTemplate cdpAppNamedParameterJdbcTemplate() {
		NamedParameterJdbcTemplate namedParameterCdpJdbcTemplate = new NamedParameterJdbcTemplate(cdpAppDataSource());
		return namedParameterCdpJdbcTemplate;
	}

}
