package org.zjm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ChatRoom.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Chat Room");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}
