package com.iscreamedu.test.api.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfigLocal {

    //dataSource 생성
//    @Primary
    @Bean(name = "lcDatasource")
    @ConfigurationProperties("spring.datasource.hikari.localdb")
    public DataSource lcdbDataSource(){
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    //sqlSessionFactory 생성
//    @Primary
    @Bean(name = "lcdbSessionFactory")
    public SqlSessionFactory lcdbSessionFactory(@Qualifier("lcDatasource") DataSource lcdbDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

        factoryBean.setDataSource(lcdbDataSource);
        factoryBean.setTypeAliasesPackage("com.iscreamedu.analytics.homelearn.api.common.mapper");
        factoryBean.setConfigLocation(applicationContext.getResource("classpath:/sqlmap/sql-mapper-config.xml"));
        factoryBean.setMapperLocations(applicationContext.getResources("classpath:/sqlmap/mappers/*.xml"));
        return factoryBean.getObject();
    }
    //sqlSession 생성
//    @Primary
    @Bean(name = "lcdbSessionTemplate")
    public SqlSessionTemplate lcdbSessionTemplate(SqlSessionFactory lcdbSessionFactory) throws Exception {
        return new SqlSessionTemplate(lcdbSessionFactory);
    }


}
