package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label myDummyLabel;
    @FXML
    private TextField userNameTextField;
@FXML
 private TextField userSurnameTextField;


    private int count  =  0;
    public void changeText(ActionEvent event){

        myDummyLabel.setText("Tekstas pakeistas "   +  ++count);
    }
    public void getUserName(ActionEvent event){
myDummyLabel.setText("Labas " + userNameTextField.getText()+" "+ userSurnameTextField.getText ());
    }
}
