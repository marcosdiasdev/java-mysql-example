package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;
    private Database() {}

    public static Connection getConnection() {
        if(connection == null) {
            try {
                String host = "localhost";
                String dbname = "feiradb";
                String url = "jdbc:mysql://" + host + "/" + dbname;
                String username = "root";
                String password = "podeporqualquercoisa"; // Essa é minha senha mesmo :)

                connection = DriverManager.getConnection(url, username, password);
                return connection;
            } catch(SQLException e) {
                System.out.println("Erro ao conectar ao banco: " + e.getMessage());
                return null;
            }
        }
        return connection;
    }
}
