package com.example.javafx_practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextBinding extends Application {
    private FlowPane pane;
    private Label label;
    private TextField textField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        label = new Label("-----");
        textField= new TextField("");

        //textField로 입력하는 글자가 label에 연결되게 하려면?
        label.textProperty().bind(textField.textProperty());
        //StringProperty끼리 바인딩해줘야 한다.
        //달라지는 속성을 앞에 써주고 .bind() 안에 그 달라지는 속성의 기준이 되는 속성값 넣어줌

        //오답
//        label.getText().textProperty().bind(textField.getText().textProperty());
        //getText string에서 property() 접근 자체가 불가

//        System.out.println(label.textProperty());
//        StringProperty [bean: Label@238b144c[styleClass=label]'', name: text, bound, value: ]
//        System.out.println(textField.textProperty());
//        StringProperty [bean: TextField@4db4cee6[styleClass=text-input text-field], name: text, value: ]

        //오답
//        textField.textProperty().bind(label.textProperty());
        //이 코드의 경우 label에 있는 내용이 textField에 들어옴.

        pane = new FlowPane(textField,label);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("text field & label Binding");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
