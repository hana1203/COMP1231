package com.example.javafx_practice;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class PropertyBindingDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 200, Color.SKYBLUE);
        Circle center = new Circle(10);
        center.centerXProperty().bind(scene.widthProperty().divide(2));
        center.centerYProperty().bind(scene.heightProperty().divide(2));

        StringProperty width = new SimpleStringProperty("Width: "); //화면에 고정되는 설명 코드
        StringProperty height = new SimpleStringProperty("Height: ");

        Text widthText = new Text(20, 30, ""); //공의 위치에 따라 달라지는 너비
        Text heightText = new Text(20, 60, ""); //달라지는 높이

        //달라지는 텍스트 너비 속성을 scene 속성에 바인딩한다!!
        widthText.textProperty().bind(width.concat(scene.widthProperty()));
        //달라지는 object의 속성을 앞에다 쓰고, 무엇의 기준에 따라 달라지는지 bind 안에다가 넣는다.

        //달라지는 텍스트 높이 속성을 scene 속성에 바인딩
        heightText.textProperty().bind(height.concat(scene.heightProperty()));

        root.getChildren().addAll(center, widthText, heightText);

        primaryStage.setTitle("Property Binding Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
