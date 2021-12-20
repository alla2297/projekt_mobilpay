package com.example.projekt_mobilpay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Connection connection;
    private Statement stmt;



    Database() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://Users/allil/IdeaProjects/MobilePay1SemesterProjekt/mobilePay.db";
            connection = DriverManager.getConnection(url);
            connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //CREATE DATABASE databasename
    public void createListUser() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS USER ("
                    + "	phone integer PRIMARY KEY,"
                    + "	Fnavn TEXT NOT NULL,"
                    + "	Email TEXT NOT NULL,"
                    + "	kontoNr TEXT NOT NULL, "
                    + "	kontrolCifre TEXT NOT NULL,"
                    + "	expirationDate TEXT NOT NULL, "
                    + "	username TEXT NOT NULL, "
                    + "	password TEXT NOT NULL, "
                    + ");";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void addNewUser(String navn,int phone,String email,int kontoNr,int kontrolCifre,String expirationDate,String username,String password) {
        try {
            String sql = "INSERT INTO bruger(navn, phone, email, kontonr, kontrolCifre, expirationDate, username, password)"
                    + "VALUES(" + phone +", "+ navn + ", " + email + ", " + kontoNr + ", "
                    + kontrolCifre + ", " + expirationDate + ", " + username + ", " + password + ");";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
   public static boolean login (String loginUserName,String loginPassword) {


       try {
           String sql = "SELECT * FROM bruger WHERE userNavn = " + loginUserName;
           Statement stmt = connection.createStatement();
           stmt.execute(sql);



       } catch (SQLException e) {
           e.printStackTrace();
       }

       // if(loginUserName == Bruger().getuserName;();
       return true;
   }
}
