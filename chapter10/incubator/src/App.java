import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;




public class App extends Application{
incubator ic = new incubator();
public void start(Stage stage)
{
    Button but1 = new Button("+");


    Button but2 = new Button("-");


    Button  but3 = new Button("Display Temperature");


    Button but4 = new Button("Help");


    HBox box1 = new HBox(but1,but2,but3,but4);
    box1.setSpacing(20);
    box1.setAlignment(Pos.CENTER);

    Label l1 = new Label();
    



    but1.setOnAction(e->
    {
    if(ic.getTemperature()<ic.max)
    {
        ic.increaseTemperature();
        l1.setText("temperature increased");
    }
    else
    {
        l1.setText("ALARM!!!! "  + "max temperture limit reached");
    }
    });


    
    but2.setOnAction(e->
    {
    if(ic.getTemperature()>ic.min)
    {
        ic.decreaseTemperature();
        l1.setText("temperature decreased");
    }
    else
    {
        l1.setText("ALARM!!!! " + "min temperture limit reached");
    }
    });


    but3.setOnAction(e->
    {
        int s = ic.getTemperature();
        
        l1.setText(" Temperature = " + String.valueOf(s));
    });


    but4.setOnAction(e->
    {
        l1.setText("no helpavailable for now");
    });



  VBox box2 = new VBox(box1, l1);
  box2.setAlignment(Pos.CENTER);
  box2.setSpacing(40);

  Scene sc = new Scene(box2);
  sc.setFill(Color.BLUE);
  stage.setTitle("incubator");
  stage.setScene(sc);
  stage.setMinHeight(500);
  stage.setMinWidth(500);
  stage.show();

}

public static void main(String[] args) {
    launch(args);
}
}