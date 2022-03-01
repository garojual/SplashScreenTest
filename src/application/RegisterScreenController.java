package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegisterScreenController {
    @FXML
    private Button eyeButton;

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
