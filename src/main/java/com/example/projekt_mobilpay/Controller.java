package com.example.projekt_mobilpay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
//import java.sql.Connection;
//import java.sql.Statement;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    //private Connection connection;
    //private Statement stmt;

    public TextField navnTextField;
    public TextField tlfTextField;
    public TextField emailTextField;
    public TextField kontoNrTextField;
    public TextField kontrolCifreTextField;
    public TextField expirationDateTextField;
    public TextField userNameTextField;
    public TextField kodeTextField;
    public TextField brugernavnTextField;
    public PasswordField kodePasswordField;

@FXML
    public void switchSceneToCreateUser(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createUserView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchSceneToLogIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LogInView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchSceneToStartScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("startScreenView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchSceneToSendMoneyScreen(ActionEvent event) throws IOException {

        Boolean registreret = false;
        String loginUserName = brugernavnTextField.getText();
        String loginPassword = kodePasswordField.getText();


        registreret = Database.login(loginUserName,loginPassword);

        if (registreret){
            root = FXMLLoader.load(getClass().getResource("sendMoneyView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        //
        //System.out.println(brugernavn+" "+password);
    }
    @FXML
    public void switchSceneToRequestMoneyScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("requestMoneyView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    //CreateUser to Create User
    public void createUser(ActionEvent event) {
        String Fnavn = navnTextField.getText();
        int phone = Integer.parseInt(tlfTextField.getText());
        String email = emailTextField.getText();
        int kontoNr = Integer.parseInt(kontoNrTextField.getText());
        int kontrolCifre = Integer.parseInt(kontrolCifreTextField.getText());
        String expirationDate = expirationDateTextField.getText();
        String username = userNameTextField.getText();
        String password = kodeTextField.getText();

        System.out.println(Fnavn + ", " + phone + ", " + email + ", " + kontoNr + ", " + kontrolCifre + ", " + expirationDate + ", " + username + ", " + password);
        //LavBruger.class(navn,telefon,email,kontoNr,kontrolCifre,expirationDate,username,password);
        Database bruger = new Database();
        bruger.addNewUser(Fnavn, phone, email, kontoNr, kontrolCifre, expirationDate, username, password);
    }

    @Override
    public String toString() {
        return "LavBruger{" +
                "navnTextField=" + navnTextField +
                ", tlfTextField=" + tlfTextField +
                ", emailTextField=" + emailTextField +
                ", kontoNrTextField=" + kontoNrTextField +
                ", kontrolCifreTextField=" + kontrolCifreTextField +
                ", expirationDateTextField=" + expirationDateTextField +
                ", userNameTextField=" + userNameTextField +
                ", kodeTextField=" + kodeTextField +
                '}';
    }
}