package it.itisarezzo.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Adan Nasir
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calcolatrice");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMinHeight(350);
        primaryStage.setMinWidth(400);
        primaryStage.setMaxHeight(350);
        primaryStage.setMaxWidth(400);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
