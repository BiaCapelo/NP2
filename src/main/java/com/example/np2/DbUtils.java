package com.example.np2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtils {

static final String database_url = "jdbc:mysql://localhost:3306/np2";
static final String database_username = "root";
static final String database_password = "1234567";
static final String insert_query = "INSERT INTO InfoAluno(nome,cpf,altura,peso) VALUES (?,?,?,?)";


public  static void insertRecord(String nome, int cpf, float altura, float peso) throws SQLException {

    try (Connection connection = DriverManager.getConnection(database_url, database_username, database_password);
         PreparedStatement preparedStatement = connection.prepareStatement(insert_query)){

        preparedStatement.setString(1,nome);
        preparedStatement.setInt(2,cpf);
        preparedStatement.setFloat(3,altura);
        preparedStatement.setFloat(4,peso);

        System.out.println(preparedStatement);

        preparedStatement.executeUpdate();

    } catch (SQLException e){
        throw new RuntimeException(e);
    }
 }


}
