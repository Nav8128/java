import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.geometry.*;

public class App extends Application{

    @Override
    public void start(Stage stage)
    {
        Circle face = new Circle(125,125,80);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);



        Circle righteye = new Circle(86, 100, 10);
        righteye.setFill(Color.BLUE);
        righteye.setStroke(Color.BLACK);



        Circle lefteye = new Circle(162, 100, 10);
        righteye.setFill(Color.BLUE);
        righteye.setStroke(Color.BLACK);


        Arc mouth = new Arc(125,150,45,35,0,-180);
        mouth.setFill(Color.BLUE);
        mouth.setStroke(Color.BLACK);
        mouth.setType(ArcType.OPEN);



        Text caption = new Text(68,40,"changing face");
        caption.setFill(Color.BLACK);
        caption.setFont(Font.font("Verdana", 15));



        Group group = new Group(face, righteye, lefteye, mouth, caption);


        Button smileButton = new Button("smile");

        Button sadbutton = new Button("sad");


        HBox buttonbBox = new HBox(10);
        buttonbBox.setAlignment(Pos.CENTER);


        buttonbBox.getChildren().addAll(smileButton,sadbutton);



        VBox root = new VBox(10);
        root.setBackground(Background.EMPTY);
        root.setAlignment(Pos.CENTER);


        root.getChildren().addAll(buttonbBox, group);


        Scene scene = new Scene(root, 250, 275, Color.WHITE);


        smileButton.setOnAction(e-> mouth.setLength(-180));


        sadbutton.setOnAction(e-> mouth.setLength(180));


        stage.setScene(scene);
        stage.setTitle("changing face");

        stage.show();








    }
        public static void main(String[] args) {
            launch(args);
        }
    }
    
