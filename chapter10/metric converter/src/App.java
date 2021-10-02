import javafx.application.Application;
import java.text.DecimalFormat;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.*;


public class App extends Application{
DecimalFormat df  =new DecimalFormat();
@Override
public void start(Stage stage) {

    TextField cm = new TextField();
    Label txtcm = new Label("CM");

    TextField inches = new TextField();
    Label txtinches = new Label("INCHES");

    Button cmtoinches = new Button(">>");
    Button inchestocm = new Button("<<");

    VBox but1 = new VBox(cmtoinches,inchestocm);
    but1.setAlignment(Pos.CENTER);
    but1.setMinSize(50, 50);

    HBox box1 = new HBox(cm,txtcm,but1,inches,txtinches);
    box1.setAlignment(Pos.CENTER);

    
    TextField km = new TextField();
    Label txtkm = new Label("KM");

    TextField miles = new TextField();
    Label txtmiles = new Label("MILES");

    Button kmtomiles = new Button(">>");
    Button milestokm = new Button("<<");

    VBox but2= new VBox(kmtomiles,milestokm);
    but2.setAlignment(Pos.CENTER);

    HBox box2 = new HBox(km,txtkm,but2,miles,txtmiles);
    box2.setAlignment(Pos.CENTER);

    VBox imp = new VBox(box1,box2);
    imp.setAlignment(Pos.CENTER);


   cmtoinches.setOnAction(e->
   {
      String s = new String(cm.getText());
      double ans = Double.parseDouble(s);
      ans = ans/2.54;
      s = df.format(ans);
      inches.setText(s);
   });


   inchestocm.setOnAction(e->
   {
    String s = new String(inches.getText());
    double ans = Double.parseDouble(s);
    ans = ans*2.54;
    s = df.format(ans);
    cm.setText(s);
   });


   kmtomiles.setOnAction(e->
   {
    String s = new String(km.getText());
    double ans = Double.parseDouble(s);
    ans = ans/1.609;
    s = df.format(ans);
    miles.setText(s);
   });


   milestokm.setOnAction(e->
   {
    String s = new String(km.getText());
    double ans = Double.parseDouble(s);
    ans = ans*1.609;
    s = df.format(ans);
    km.setText(s);
   });


    Scene scene = new Scene(imp);
    stage.setScene(scene);
    stage.setMinHeight(200);
    stage.setMinWidth(200);
    stage.setTitle("metric converter");
    stage.show();












    

}
   
public static void main(String[] args) {
    launch(args);
}
}