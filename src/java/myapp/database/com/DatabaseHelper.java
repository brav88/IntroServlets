/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.database.com;

import java.sql.*;

/**
 *
 * @author Personal
 */
public class DatabaseHelper {

    private Connection conn;

    public Connection getConnection() {
        return conn;
    }

    public DatabaseHelper() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MyApp", "root", "Admin$1234");
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(DatabaseHelper.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void Close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.getLogger(DatabaseHelper.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
