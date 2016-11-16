package org.cqm.data.configuration;

/**
 * Created by Dmitriy on 08.11.2016.
 */
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Configuration class of Spring IoC container
 */
@Configuration
@ComponentScan(basePackages = "org.cqm.data.configuration")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.cqm.data")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        //Connection pool
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("89061361420");
        return dataSource;
    }


    @Bean
    public HibernateJpaDialect hibernateJpaDialect() {
        return new HibernateJpaDialect();
    }


    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.POSTGRESQL);
        vendorAdapter.setGenerateDdl(false);
        return vendorAdapter;
    }

    @Bean
    protected LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(jpaVendorAdapter());
        factory.setPackagesToScan("org.cqm.data.entity");
        factory.setDataSource(dataSource());
        factory.setJpaDialect(hibernateJpaDialect());
        factory.setPersistenceUnitName("cqmProject");
        /*
        Properties jpaProperties = new Properties();
        jpaProperties.put(Environment.DIALECT, this.dialect);
        jpaProperties.put(Environment.HBM2DDL_AUTO, this.hbm2ddlAuto);
        */
        return factory;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        transactionManager.setPersistenceUnitName(entityManagerFactory().getPersistenceUnitName());
        return transactionManager;
    }

}