package com.ApplicationRH.AppRH.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataConfig {
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(null);
        dataSource.setUrl(null);
        dataSource.setUsername(null);
        dataSource.setPassword(null);
        return (DataSource) dataSource;
    }
}
