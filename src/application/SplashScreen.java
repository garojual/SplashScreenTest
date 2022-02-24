package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class SplashScreen extends ScrollPane {

    private HBox mainHBox;

    private VBox leftVBox;
    private VBox centerVBox;
    private VBox rightVBox;
    private HBox auxHBOX;

    private Button leftButton;
    private Button centerButton;
    private Button rightButton;
    private Button auxButton;

    public SplashScreen(){
        super();
        this.createInterface();
    }


    private void createInterface(){

        leftVBox = new VBox();
        leftVBox.setAlignment(Pos.CENTER);
        leftVBox.setStyle("-fx-background-color: #416b8d;");
        leftVBox.setPrefWidth(150);
        leftButton = new Button("BackButton");
        leftVBox.getChildren().add(leftButton);

        centerVBox = new VBox();
        centerVBox.setId("centerVBox");
        centerVBox.setAlignment(Pos.TOP_CENTER);
        //centerVBox.setStyle("-fx-background-color: #e77d3d;");
        centerVBox.setPrefWidth(500);
        centerButton = new Button("Progress Bar");
        centerVBox.getChildren().add(centerButton);


        rightVBox = new VBox();
        rightVBox.setAlignment(Pos.TOP_CENTER);
        rightVBox.setStyle("-fx-background-color: #8d4180;");
        rightVBox.setPrefWidth(150);
        rightButton = new Button("Next Button");
        rightButton.setTranslateY(140);

        auxHBOX = new HBox();
        auxHBOX.setAlignment(Pos.TOP_CENTER);
        auxHBOX.setStyle("-fx-background-color: #7bb06f;");
        auxHBOX.setPrefHeight(150);
        auxButton = new Button("Skip");
        auxHBOX.getChildren().add(auxButton);

        rightVBox.getChildren().add(auxHBOX);
        rightVBox.getChildren().add(rightButton);

        mainHBox = new HBox();
        mainHBox.setPrefSize(800,600);
        mainHBox.setStyle("-fx-background-color: #7bb06f;");
        mainHBox.getChildren().add(leftVBox);
        mainHBox.getChildren().add(centerVBox);
        mainHBox.getChildren().add(rightVBox);

        this.setContent(mainHBox);
        this.prefHeight(800);
        this.prefWidth(600);

    }

}
