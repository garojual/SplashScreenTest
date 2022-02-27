package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class SplashScreen extends ScrollPane {

    private HBox mainHBox;

    private VBox leftVBox;
    private VBox centerVBox;
    private VBox rightVBox;
    private HBox auxHBOX;

    private Button leftButton;
    private Button rightButton;
    private Button skipButton;

    private ProgressBar splashProgressBar;


    public SplashScreen(){
        super();
        this.createInterface();
    }


    private void createInterface(){

        //INIT LEFT BOX AND BUTTON-----------------------------
        leftVBox = new VBox();
        leftVBox.setAlignment(Pos.CENTER);
        leftVBox.setPrefWidth(150);

        leftButton = new Button();
        leftButton.setId("leftButton");
        leftButton.setPrefWidth(50);
        leftButton.setPrefHeight(50);

        leftVBox.getChildren().add(leftButton);

        //END LEFT BOX AND BUTTON------------------------------

        //INIT MID BOX AND PROGRESS BAR -----------------------
        centerVBox = new VBox();
        centerVBox.setId("centerVBox");
        centerVBox.setAlignment(Pos.TOP_CENTER);
        centerVBox.setPrefWidth(500);
        centerVBox.setPrefHeight(550);
        centerVBox.setMaxHeight(USE_PREF_SIZE);
        centerVBox.setTranslateY(25);

        splashProgressBar = new ProgressBar(0.25);
        splashProgressBar.setId("splashProgressBar");

        //Need add imageview and content
        centerVBox.getChildren().add(splashProgressBar);

        //END MID BOX AND PROGRESS BAR --------------------------

        //INIT RIGHT BOX AND BUTTONS
        rightVBox = new VBox();
        rightVBox.setAlignment(Pos.TOP_CENTER);
        rightVBox.setPrefWidth(150);

        rightButton = new Button();
        rightButton.setId("rightButton");
        rightButton.setPrefSize(50, 50);
        rightButton.setTranslateY(125);

        auxHBOX = new HBox();
        auxHBOX.setAlignment(Pos.TOP_CENTER);
        auxHBOX.setPrefHeight(150);

        skipButton = new Button("S K I P");
        skipButton.setId("skipButton");
        skipButton.setTranslateY(30);

        auxHBOX.getChildren().add(skipButton);

        rightVBox.getChildren().add(auxHBOX);
        rightVBox.getChildren().add(rightButton);

        //END RIGHT BOX AND BUTTONS ----------------------------

        mainHBox = new HBox();
        mainHBox.setId("mainHBox");
        mainHBox.setPrefSize(798,598);//Modified to fill exactly the window without show the scroll bar
        mainHBox.getChildren().add(leftVBox);
        mainHBox.getChildren().add(centerVBox);
        mainHBox.getChildren().add(rightVBox);

        this.setContent(mainHBox);
        this.prefWidth(800);
        this.prefHeight(600);

    }

}
