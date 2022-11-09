package com.iscreamedu.test.api.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    //dataSource 생성
    @Primary
    @Bean(name = "dataSource")
    @ConfigurationProperties("spring.datasource.hikari.salesdb")
    public DataSource salesDataSource() {
        return DataSourceBuilder.create().build();
    }

}
