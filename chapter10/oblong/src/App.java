
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class App extends Application{

    oblong1 ob = new oblong1(0, 0);
      public void start(Stage stage)
      {
          TextField length = new TextField();
          length.setMaxWidth(50);


          TextField width = new TextField();
          width.setMaxWidth(50);


          TextArea display = new TextArea();
          display.setEditable(false);
          display.setMinSize(210, 50);
          display.setMaxSize(210, 50);


          Label Labellength =new Label("Length"); 
          Labellength.setTextFill(Color.RED);
          Labellength.setFont(Font.font("Arial", 20));


          Label labelwidth = new Label("width");
          labelwidth.setTextFill(Color.RED);
          labelwidth.setFont(Font.font("Arial",20));


          Button calculate = new Button("calculate");
          calculate.setOnAction(e->
          {
              if(length.getText().isEmpty() || width.getText().isEmpty())
              {
                 display.setText("length and height must be enterd");
              }
              else
              {
                  ob.setLenght(Double.parseDouble(length.getText()));
                  ob.setHeight(Double.parseDouble(width.getText()));

                  display.setText("Area = " + ob.calculateArea() + "\n" + "Perimeter = " + ob.calculatePerimeter());
              }
          });
          
        HBox box1 = new HBox(Labellength,length, labelwidth, width);
        box1.setAlignment(Pos.CENTER);
        

        VBox v = new VBox(25);
         v = new VBox(box1, calculate,display);
        v.setAlignment(Pos.CENTER);
       




        Scene scene = new Scene(v,350,350);
        stage.setScene(scene);
        stage.setTitle("oblong");
        stage.show();

      }

      public static void main(String[] args) {
          launch(args);
      }

}