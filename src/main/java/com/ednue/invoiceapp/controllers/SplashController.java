package com.ednue.invoiceapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Objects;

import javafx.application.Platform;

public class SplashController {

    @FXML
    private ImageView logoImage;

    @FXML
    public void initialize() {
        // Set Ednue logo
        logoImage.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/New Preloader Design Gif format.gif"))));

        // Transition to Dashboard after 2 seconds
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Wait for 2 seconds
                Platform.runLater(this::loadDashboard);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void loadDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dashboard.fxml"));
            Stage stage = (Stage) logoImage.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
