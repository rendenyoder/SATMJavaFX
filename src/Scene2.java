import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene2{
    //Scene 2 variable
    protected static Scene scene2;

    //Set Scene 2
    protected static Scene setScene2(Stage window){

        //SCENE 2 GOES HERE
        Label label2 = new Label("SCENE 2 GOES HERE");
        Button button = new Button("Go back to Scene 1!");
        button.setOnAction(e -> window.setScene(Scene1.setScene1(window)));

        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button);
        scene2 = new Scene(layout2, Main.WIDTH, Main.HEIGHT);
        scene2.getStylesheets().add("screen.css");

        return scene2;
    }

    //Get Scene 2 if it has already been set
    public Scene getScene2(){return scene2;}
}
