package com.example.javafx_practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloApplication extends Application {
    public void start(Stage primaryStage) {
        Text hello = new Text(50,50, "Hello!");
        Text ques = new Text(120, 80, "Howdy?");

        Group root = new Group(hello, ques);
        Scene scene = new Scene(root, 300, 120, Color.LAVENDER);

        primaryStage.setTitle("A JavaFX program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}