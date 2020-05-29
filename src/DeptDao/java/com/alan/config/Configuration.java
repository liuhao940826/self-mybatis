package com.alan.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @PACKAGE_NAME: com.alan.config
 * @NAME: Configuration
 * @USER: liuhao
 * @DATE: 2020-05-27 16:24
 * @WEEK: Wednesday
 * @PROJECT_NAME: self-mybatis
 **/
public class Configuration {


    private static Connection con;

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/self-mybaits", "root", "root");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
