package com.its.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@PropertySource("classpath:c3p0.properties")
public class C3p0DataSources {
    //声明了@Configuration之后Spring会当这个类为一个配置文件
    //PropertySource读取外部属性文件

    @Value("${c3p0.jdbcUrl}")
    String jdbcUrl;
    @Value("${c3p0.driverClass}")
    String driverClass;
    @Value("${c3p0.user}")
    String user;
    @Value("${c3p0.password}")
    String password;

    @Bean
    public DataSource dataSource() throws PropertyVetoException {

        ComboPooledDataSource ds = new ComboPooledDataSource();

        ds.setDriverClass(driverClass);
        ds.setJdbcUrl(jdbcUrl);
        ds.setUser(user);
        ds.setPassword(password);

        return ds;
    }

}
