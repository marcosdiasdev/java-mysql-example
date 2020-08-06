package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    Connection con = Database.getConnection();
        System.out.println(con);

        String query = "SELECT * FROM produtores";

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()) {
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");

                System.out.println(nome + " - " + cpf);
            }

        } catch(SQLException e) {
            System.out.println("Erro ao consultar o banco de dados: " + e.getMessage());
        }
    }
}
