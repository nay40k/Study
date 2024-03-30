package org.example;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    TextField inputField;

    public void btn1Action(ActionEvent event) {
        inputField.setText(inputField.getText() + "1");
    }
    public void btn2Action(ActionEvent event) {
        inputField.setText(inputField.getText() + "2");
    }
    public void btn3Action(ActionEvent event) {
        inputField.setText(inputField.getText() + "3");
    }
    public void btn4Action(ActionEvent event) {
        inputField.setText(inputField.getText() + "4");
    }
    public void btnPlusAction(ActionEvent event) {
        inputField.setText(inputField.getText() + "+");
    }
    public void btnCalculateAction(ActionEvent event) {
        inputField.setText("идет подсчет...");
    }
}