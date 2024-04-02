module com.example.chattcp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chattcp to javafx.fxml;
    exports com.example.chattcp;
}