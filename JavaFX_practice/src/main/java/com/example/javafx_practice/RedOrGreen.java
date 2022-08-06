package com.example.javafx_practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RedOrGreen extends Application {

    private Button redButton, greenButton;
    private FlowPane pane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(RedOrGreen.class.getResource("hello-view.fxml"));

        redButton = new Button("Red");
        greenButton = new Button("Green");
        redButton.setOnAction(this::processColorButton);
        greenButton.setOnAction(this::processColorButton);

        pane = new FlowPane(redButton, greenButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Red or Green?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processColorButton(ActionEvent event) {
        if (event.getSource() == redButton) {
            pane.setStyle("-fx-background-color: crimson");
        } else {
            pane.setStyle("-fx-background-color: green");
        }
    }
}
