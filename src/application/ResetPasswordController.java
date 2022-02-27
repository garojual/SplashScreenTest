package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ResetPasswordController {
    @FXML
    private Label errorText;
    @FXML
    private Button eyeButton;

    @FXML
    protected void onSubmitClick() {
        errorText.setText("Error: Please input a correct mail direction");
        errorText.setId("errorLabel");
    }

    @FXML
    protected void onEyeButton(){
        String id = eyeButton.getId();

        if(id.equals("eyeButtonOff")){
            eyeButton.setId("eyeButtonOn");
        }
        else{
            eyeButton.setId("eyeButtonOff");
        }
    }
}
