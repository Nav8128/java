

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.TriangleMesh;
import javafx.geometry.*;
import javafx.stage.Stage;


public class App extends Application{
    public void start(Stage stage)
    {
   
   Polygon triangle = new Polygon();
   triangle.getPoints().setAll(100.0,70.0,100.0,250.0,400.0,250.0);
   triangle.setFill(Color.AQUA);
   


   Group g = new Group();
   g.getChildren().add(triangle);
   


    Scene sc = new Scene(g);
    sc.setFill(Color.YELLOWGREEN);
    


    stage.setTitle("triangle");
    stage.setScene(sc);
    stage.setMinHeight(500);
    stage.setMinWidth(500);
    
    stage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
