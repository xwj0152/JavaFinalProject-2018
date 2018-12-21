package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1440, 925));
        //primaryStage.setResizable(false);

        Controller controller = fxmlLoader.getController();
        controller.setPrimaryStage(primaryStage);

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.out.println("退出游戏！");
                System.exit(0);
            }
        });

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
