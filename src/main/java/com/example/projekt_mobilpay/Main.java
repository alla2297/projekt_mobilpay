package com.example.projekt_mobilpay;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("startScreenView.fxml"));
        primaryStage.setTitle("EasyPay");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        Database db = new Database();
        db.createListUser();
        db.addNewUser("the program is broken, please fix it", 18, "Døende", 19, 3920, "D. 9.", "Bo", "password" );
        //Database.DbSql();



    }
}