package application;
	
import java.io.IOException;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("startPageUI.fxml"));
			Scene scene = new Scene(root,942,647);
			primaryStage.setScene(scene);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// Set the icon for the stage
	        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("netflixLogo.png")));

			primaryStage.setTitle("Netflix Pakistan - Watch TV Shows Online, Watch Movies Online");
			// Open "LandingPageUI.fxml" after 2 seconds
	        Duration delay = Duration.seconds(2);
	        Timeline timeline = new Timeline(new KeyFrame(delay, event -> openLandingPage(primaryStage)));
	        timeline.play();

	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	 private void openLandingPage(Stage primaryStage) {
	        try {
	            Parent landingPageRoot = FXMLLoader.load(getClass().getResource("LandingPageUI.fxml"));
	            Scene landingPageScene = new Scene(landingPageRoot);
	            primaryStage.setScene(landingPageScene);
	            primaryStage.setFullScreen(true);
	        } catch (IOException e) {
	            e.printStackTrace(); // Handle exception appropriately
	        }
	    }
	public static void main(String[] args) {
		launch(args);
	}
}
