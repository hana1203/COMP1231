package com.example.javafx_practice;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class clickCounter extends Application {
    private int count;
    private Text countText;

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(clickCounter.class.getResource("hello-view.fxml"));
        //fxml 파일을 연결을 해줘야지 build 성공하고 화면에 뜬다.

        count = 0;
        countText = new Text("Clicks: 0");
        Button click = new Button("Click me!");
        click.setOnAction((event)-> {
            count++;
            countText.setText("Clicks: " + count);
        });

        FlowPane pane = new FlowPane(click, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: papayawhip");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
