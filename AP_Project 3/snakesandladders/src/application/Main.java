package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Objectcontrollers1.fxml"));
        primaryStage.setTitle("SNAKES & LADDERS");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        primaryStage.setOnCloseRequest(windowEvent -> {
            windowEvent.consume();
            logout(primaryStage);
        });
    }

    public void logout(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("LOGOUT");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Do you want to Quit Anyway??");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("logout");
            stage.close();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}