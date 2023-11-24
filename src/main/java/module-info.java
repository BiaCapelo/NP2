module com.example.np2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.np2 to javafx.fxml;
    exports com.example.np2;
}