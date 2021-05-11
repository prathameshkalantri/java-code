package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class database {

    public static final String dbName = "lic";
    public static final String connectionString = "jdbc:mysql://localhost/" + dbName;
    public static final String hostName = "root";
    public static final String password = "password";
    private static database databaseInstance = new database();
//    private static Connection con;
    private Connection connection;
    public Statement statement = null;

    private database() {
        System.out.println("I am here");
        this.connection = this.getConnection();
    }

    private static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionString, hostName, password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Statement getStatement() throws SQLException {
        this.statement = this.connection.createStatement();
        return this.statement;
    }

    public static database getInstance() {
//        if (databaseInstance == null) {
//            databaseInstance = new database();
//        }
        return databaseInstance;
    }

}