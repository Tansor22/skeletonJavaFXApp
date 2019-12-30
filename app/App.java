package app;

import javafx.application.Application;
import javafx.stage.Stage;
import window.WindowsManager;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
         Window mainWindow = WindowsManager.getWindow("mainForm", "Скелет");
		 mainWindow.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
