package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
        System.out.println("Program closed");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


//        primaryStage.setTitle("Hello world");
//
//        primaryStage.setWidth(320);
//        primaryStage.setHeight(240);
//
////        Label helloWorldLabel = new Label("Hello world!");
//
//        HBox hBox = new HBox();
//        Button btn1 = new Button("1");
//        Button btn2 = new Button("2");
//        Button btn3 = new Button("3");
//        Button btn4 = new Button("4");
//
//        TextField textField = new TextField();
//
//        btn1.setOnMouseClicked(event -> {
//            btn4.setText("1");
//
//        });
//        btn2.setOnMouseClicked(event -> {
//            btn4.setText("2");
//
//        });
//        btn3.setOnMouseClicked(event -> {
//            btn4.setText("3");
//
//        });
//        btn4.setOnMouseClicked(event -> {
//            btn4.setText(textField.getText());
//
//        });
//
//
//
//        hBox.getChildren().addAll(btn1, btn2, btn3, btn4, textField);
//
////        helloWorldLabel.setAlignment(Pos.CENTER);
//        Scene primaryScene = new Scene(hBox);
//        primaryStage.setScene(primaryScene);
//
////        primaryStage.setTitle("Hello JavaFX");
//
//
//        primaryStage.show();


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/MainScene.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Hello Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);
        primaryStage.show();

    }
}