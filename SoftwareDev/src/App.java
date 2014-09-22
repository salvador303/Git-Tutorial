import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class App extends Application {
    
    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("True");
        Parent root = FXMLLoader.load(getClass().getResource("u.fxml"));
    
        Scene scene = new Scene(root);
    
        primaryStage.setTitle("Example");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>()
        {
                @Override
                public void handle(WindowEvent t)
                {
                        Platform.exit();
                        primaryStage.setOpacity(0);
                        System.exit(0);
                }
        });


    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

}
