package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.net.MalformedURLException;
import java.net.URL;



public class SplashScreen extends ScrollPane {

    private HBox mainHBox;

    private VBox leftVBox;
    private VBox centerVBox;
    private VBox rightVBox;
    private HBox auxHBOX;

    private Button leftButton;
    private ProgressBar splashProgressBar;
    private Button rightButton;
    private Button skipButton;


    public SplashScreen(){
        super();
        this.createInterface();
    }


    private void createInterface(){

        // = new ImageView(getClass().getResource("/Resources/imgs/favpng_arrow-keys-clockwise-material-design.png").toExternalForm());

        leftVBox = new VBox();
        leftVBox.setAlignment(Pos.CENTER);
        leftVBox.setPrefWidth(150);
        leftButton = new Button();
        leftButton.setId("leftButton");
        leftButton.setPrefWidth(50);
        leftButton.setPrefHeight(50);
        leftVBox.getChildren().add(leftButton);

        centerVBox = new VBox();
        centerVBox.setId("centerVBox");
        centerVBox.setAlignment(Pos.TOP_CENTER);
        //centerVBox.setStyle("-fx-background-color: #e77d3d;");
        centerVBox.setPrefWidth(500);
        splashProgressBar = new ProgressBar(0.25);
        splashProgressBar.setId("splashProgressBar");
        centerVBox.getChildren().add(splashProgressBar);


        rightVBox = new VBox();
        rightVBox.setAlignment(Pos.TOP_CENTER);
        //rightVBox.setStyle("-fx-background-color: #8d4180;");
        rightVBox.setPrefWidth(150);
        rightButton = new Button();
        rightButton.setId("rightButton");
        rightButton.setPrefSize(50, 50);
        rightButton.setTranslateY(140);

        auxHBOX = new HBox();
        auxHBOX.setAlignment(Pos.TOP_CENTER);
        //auxHBOX.setStyle("-fx-background-color: #7bb06f;");
        auxHBOX.setPrefHeight(150);
        skipButton = new Button("S K I P");
        skipButton.setId("skipButton");
        skipButton.setTranslateY(30);
        auxHBOX.getChildren().add(skipButton);

        rightVBox.getChildren().add(auxHBOX);
        rightVBox.getChildren().add(rightButton);

        mainHBox = new HBox();
        mainHBox.setId("mainHBox");
        mainHBox.setPrefSize(800,600);
        //mainHBox.setStyle("-fx-background-color: #7bb06f;");
        mainHBox.getChildren().add(leftVBox);
        mainHBox.getChildren().add(centerVBox);
        mainHBox.getChildren().add(rightVBox);

        this.setContent(mainHBox);
        this.prefHeight(800);
        this.prefWidth(600);

    }

}
