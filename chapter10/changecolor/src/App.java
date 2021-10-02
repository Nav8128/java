import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class App extends Application{

public void start(Stage stage){

Button but1 = new Button("Red");


Button but2 = new Button("blue");

HBox box = new HBox(but1,but2);
box.setSpacing(20);
box.setAlignment(Pos.CENTER);



Scene scene  = new Scene(box);
scene.setFill(Color.GREEN);
scene.setFill(Color.BLACK);
stage.setTitle("color changing background");
stage.setScene(scene);
stage.setMinHeight(500);
stage.setMinWidth(500);

but1.setOnAction(e->
{
   scene.setFill(Color.RED);
});


but2.setOnAction(e->
{
    scene.setFill(Color.BLUE);
});


stage.show();

}
public static void main(String[] args) {
    launch(args);
}
}