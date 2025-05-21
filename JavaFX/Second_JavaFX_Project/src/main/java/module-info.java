module com.example.second_javafx_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.second_javafx_project to javafx.fxml;
    exports com.example.second_javafx_project;
}