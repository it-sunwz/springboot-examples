package com.its.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.*;

@Controller
public class GetDataSourceExample {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() throws SQLException {

        String sql = "select * from student";
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();

        return "Controller GetDataSourceExample.hello() is running!!";
    }

}
