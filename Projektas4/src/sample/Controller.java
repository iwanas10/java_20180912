package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
@FXML
private Label myDummyNumberLabel;
@FXML
private Label myDummyAnswerLabel;
@FXML
private Label computerDummyAnswerLabel;
 @FXML
 private TextField userNumberTextField;

    public void getUserNumber (ActionEvent event){
        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        int spejimas = Integer.parseInt(userNumberTextField.getText());
        if(randomNumber == spejimas){
            myDummyAnswerLabel.setText("Jus atspejote " + randomNumber);
            computerDummyAnswerLabel.setText("");
        }else{
            computerDummyAnswerLabel.setText("Jus neatspejote, zaiskite dar karta " + randomNumber);
            myDummyAnswerLabel.setText("");
        }
        userNumberTextField.setText("");
    }




}




