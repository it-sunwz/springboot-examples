package com.its.config2;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class C3p0DataSourceClass2 {

    @Bean
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource(){
        ComboPooledDataSource ds = new ComboPooledDataSource();
        return ds;
    }
}
