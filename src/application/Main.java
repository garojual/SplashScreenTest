package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	/*
	* sceneNumber controls for now which part of the GUI is displayed
	* 0   = Splash Screen
	* 1   = Register Screen
	* 2++ = Reset Password Screen
	* IMPORTANT = Make the classes for all the other GUI's
	*/
	int sceneNumber = 2;
	Image icon = new Image(getClass().getResourceAsStream("/Resources/imgs/32x32logo.png"));

	@Override
	public void start(Stage primaryStage) {
		//Splash Screen
		if (sceneNumber == 0) {
			try {
				SplashScreen root = new SplashScreen();
				Scene scene = new Scene(root, 800, 600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Music Player - Splash");
				primaryStage.getIcons().add(icon);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Register Screen
		else if(sceneNumber == 1) {
			FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/Resources/fxml/registerScreen.fxml"));
			Scene scene;
			try {
				scene = new Scene(fxmlLoader.load(), 800, 600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Music Player - Register Screen");
				primaryStage.getIcons().add(icon);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Reset Password
		else {
			FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/Resources/fxml/resetPasswordFirstScene.fxml"));
			Scene scene;
			try {
				scene = new Scene(fxmlLoader.load(), 800, 600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Music Player - Reset Password");
				primaryStage.getIcons().add(icon);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
