module com.example.projekt_mobilpay {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.projekt_mobilpay to javafx.fxml;
    exports com.example.projekt_mobilpay;
}