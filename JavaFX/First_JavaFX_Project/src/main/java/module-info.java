module com.example.first_javafx_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.first_javafx_project to javafx.fxml;
    exports com.example.first_javafx_project;
}