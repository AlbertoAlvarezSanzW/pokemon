package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600  , 400));
        primaryStage.show();

        //Parametros para que la pantalla no se pueda mover
        primaryStage.setHeight(500);
        primaryStage.setWidth(650);
        primaryStage.setMaxHeight(500);
        primaryStage.setMaxWidth(650);
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(650);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
