package com.example.ejerciciok;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class EjercicioKController {

    @FXML
    private ImageView ivHorasDerecha;
    @FXML
    private ImageView ivHorasIzquierda;
    @FXML
    private ImageView ivMinutosDerecha;
    @FXML
    private ImageView ivMinutosIzquierda;
    @FXML
    private ImageView ivSegundosDerecha;
    @FXML
    private ImageView ivSegundosIzquierda;

    private final Timer timer = new Timer();

    public void initialize() {
        startClock();
    }

    private void startClock() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                updateClock();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Actualiza cada segundo
    }

    private void updateClock() {
        LocalDateTime now = LocalDateTime.now();

        int horas = now.getHour();
        int minutos = now.getMinute();
        int segundos = now.getSecond();

        updateHourImages(horas);
        updateMinuteImages(minutos);
        updateSecondImages(segundos);
    }

    private void updateHourImages(int horas) {
        int leftHour = horas / 10; // Horas a la izquierda
        int rightHour = horas % 10; // Horas a la derecha

        ivHorasIzquierda.setImage(getImageForNumber(leftHour));
        ivHorasDerecha.setImage(getImageForNumber(rightHour));
    }

    private void updateMinuteImages(int minutos) {
        int leftMinute = minutos / 10; // Minutos a la izquierda
        int rightMinute = minutos % 10; // Minutos a la derecha

        ivMinutosIzquierda.setImage(getImageForNumber(leftMinute));
        ivMinutosDerecha.setImage(getImageForNumber(rightMinute));
    }

    private void updateSecondImages(int segundos) {
        int leftSecond = segundos / 10; // Segundos a la izquierda
        int rightSecond = segundos % 10; // Segundos a la derecha

        ivSegundosIzquierda.setImage(getImageForNumber(leftSecond));
        ivSegundosDerecha.setImage(getImageForNumber(rightSecond));
    }

    private javafx.scene.image.Image getImageForNumber(int number) {
        String imageName = switch (number) {
            case 0 -> "ZERO.png";
            case 1 -> "ONE.png";
            case 2 -> "TWO.png";
            case 3 -> "THREE.png";
            case 4 -> "FOUR.png";
            case 5 -> "FIVE.png";
            case 6 -> "SIX.png";
            case 7 -> "SEVEN.png";
            case 8 -> "EIGHT.png";
            case 9 -> "NINE.png";
            default -> "ZERO.png"; // Por defecto, si el número es inválido
        };

        // Cargar la imagen desde el directorio de recursos
        return new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + imageName));
    }
}
