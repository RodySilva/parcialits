module com.mycompany.parcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.mycompany.parcial to javafx.fxml;
    exports com.mycompany.parcial;
}