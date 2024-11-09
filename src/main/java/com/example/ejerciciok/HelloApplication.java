package com.example.ejerciciok;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación que inicia la interfaz gráfica utilizando JavaFX.
 * Esta clase extiende {@link Application} y sirve como el punto de entrada para la aplicación.
 */
public class HelloApplication extends Application {

    /**
     * Metodo que se llama al iniciar la aplicación.
     * Carga el archivo FXML y configura la escena principal.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si hay un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EjercicioK.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 465, 400);
        stage.setTitle("Ejercicio K!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Metodo principal que se utiliza para lanzar la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        launch();
    }
}
