import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class ManagerMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ManagerScene.fxml")));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setTitle("My Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
