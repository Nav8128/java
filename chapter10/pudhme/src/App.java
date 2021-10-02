import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class App extends Application{ 
    
@Override
public void start(Stage stage)  {
    
    TextField txt = new TextField();

    Label display = new Label();
    display.setTextFill(Color.RED);
    display.setFont(Font.font(30));
    


    Button but = new Button("PUSHME");

    Button but2  = new Button("GET TOTAL WORDS");

    HBox box = new HBox(but, but2);
    box.setAlignment(Pos.CENTER);
    box.setSpacing(20);


    VBox root = new VBox(txt,box,display);
    root.setAlignment(Pos.CENTER);
    root.setSpacing(20);

    but.setOnAction(e->
    {
        String s= txt.getText();
        display.setText(s.toUpperCase());
    });



    
    but2.setOnAction(e->
    {
        String s= txt.getText();
        s = s.trim();
        int a = s.length();
        
         display.setText( "total words = " + String.valueOf(a));
    
    });





Scene sc = new Scene(root);
stage.setScene(sc);
stage.setMinHeight(500);
stage.setMinWidth(500);
stage.setTitle("pushme");
stage.show();

}

public static void main(String[] args) {
    launch(args);
}
}