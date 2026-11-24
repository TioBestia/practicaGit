module com.mycompany.practicacion {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.practicacion to javafx.fxml;
    exports com.mycompany.practicacion;
}
