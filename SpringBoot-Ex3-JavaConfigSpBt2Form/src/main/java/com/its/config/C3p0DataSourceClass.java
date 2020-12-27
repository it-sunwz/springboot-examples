package com.its.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//@Configuration
//@EnableConfigurationProperties(C3p0PropertiesClass.class)
public class C3p0DataSourceClass {

    //@Bean
    public DataSource dataSource(C3p0PropertiesClass cpc) throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();

      /*  ds.setDriverClass(cpc.getDriverClass());
        ds.setJdbcUrl(cpc.getJdbcUrl());
        ds.setUser(cpc.getUser());
        ds.setPassword(cpc.getPassword());*/

        return ds;
    }
}
