module com.example.ejerciciok {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejerciciok to javafx.fxml;
    exports com.example.ejerciciok;
}