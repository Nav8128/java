



import java.text.NumberFormat;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{


    private int noofrooms = getNumberOfRooms();
     private TenantList t = new TenantList(noofrooms);
     
     private TenantFileHandler th;

     Label head = new Label("Hostel Application");
     Label room = new Label("Room");
     TextField roomField = new TextField();
     Label name = new Label("Name");
     TextField nameField = new TextField();
     Button addtenant = new Button("add tenant");
     Button removetenant = new Button("remove tenant");
     Button displaytenant = new Button("display tenant");
     Button saveandquit = new Button("save and quit");
     TextArea display1 = new TextArea();
     Label room1 = new Label("Room");
     TextField roomField1 = new TextField();
     Label month = new Label("Month");
     TextField monthField = new TextField();
     Label amount = new Label("Amount");
     TextField amounField = new TextField();
     Button makepayment = new Button("make payment");
     Button listpayments = new Button("list payments");
     TextArea display2 = new TextArea();
    




    public void start(Stage stage)
    {
        
        head.setFont(Font.font("Cambria", 32));

        room.setFont(Font.font("Cambria", 18));

        name.setFont(Font.font("Cambria", 18));

        HBox box1 = new HBox(room, roomField,name,nameField);
        box1.setSpacing(20);
        box1.setAlignment(Pos.CENTER);

        HBox box2 = new HBox(addtenant,displaytenant,removetenant,saveandquit);
        box2.setSpacing(20);
        box2.setAlignment(Pos.CENTER);

        HBox disp1 = new HBox(display1);
        disp1.setMinHeight(60);
        disp1.setMinWidth(800);
        disp1.setAlignment(Pos.CENTER);

        room1.setFont(Font.font("Cambria", 18));

        month.setFont(Font.font("Cambria", 18));

        amount.setFont(Font.font("Cambria", 18));

        HBox box3 = new HBox(room1,roomField1,month,monthField,amount,amounField);
        box3.setSpacing(20);
        box3.setAlignment(Pos.CENTER);

        HBox box4 = new HBox(makepayment,listpayments);
        box4.setSpacing(20);
        box4.setAlignment(Pos.CENTER);

        HBox disp2 = new HBox(display2);
        disp2.setMinHeight(60);
        disp2.setMinWidth(800);
        disp2.setAlignment(Pos.CENTER);

        VBox v1 = new VBox(10);
        v1.getChildren().addAll(head,box1,box2,disp1,box3,box4,disp2);
        v1.setSpacing(30);
        v1.setAlignment(Pos.CENTER);

        addtenant.setOnAction(e-> addTenantHandler());
        removetenant.setOnAction(e-> removetenanthandler());
        displaytenant.setOnAction(e-> displayhandler());
        makepayment.setOnAction(e-> makepaymenthandler());
        listpayments.setOnAction(e-> displaypaymenthamdler());
    

     
        Scene sc = new Scene(v1,Color.LIGHTBLUE);
      
        stage.setTitle("hostel application");
        stage.setScene(sc);
        stage.setMinWidth(900);
        stage.setMinHeight(800);
        stage.show();


    }
     

    private int getNumberOfRooms()
    {
        TextInputDialog d = new TextInputDialog();
        d.setHeaderText("Hoe many rooms?");
        d.setTitle("Room Information Request");
        String response = d.showAndWait().get();
        return Integer.parseInt(response);
    }

    

   private void addTenantHandler()
    {
        
    String room = roomField.getText();
    String name = nameField.getText();
    if(room.isEmpty() || name.isEmpty())
    {
        display1.setText("room and name cannot be empty");
    }
    else
    {   int roomdemo;
        roomdemo = Integer.parseInt(room);
        boolean done = t.isFull();
        if(!done)
        {   
            Tenant ten = new Tenant(name, roomdemo);
            t.addTenant(ten);
            display1.setText("Tenant Added Successfully!");
        }
        else
        {
            display1.setText("Rooms are full!");
        }
    }
    }






    private void removetenanthandler()
    {
       String room = roomField.getText();
       String name = nameField.getText();
       if(room.length()==0 || name.length()==0)
       {
           display1.setText("name and room field cannot be empty");
       }
       else
       {
           int roomdemo = Integer.parseInt(room);
           Tenant demo =  t.Search(roomdemo);
           if(demo != null)
           {
                if(!demo.getName().equals(name))
                {
                  display1.setText("please check the name entered");
                }
                else if(demo.getRoom()!= roomdemo)
                {
                    display1.setText("please check the number entered");
                }
                else
                {    
                    boolean done = t.removeTenant(roomdemo);
                    if(done)
                    {
                        display1.setText("tenant removed succesfully");
                    }
                    else
                    {
                        display1.setText("unsuccessfull!");
                    }
                }
           }
           else
           {
               display1.setText("Room number enterd does not exist");
           }
       }
    }

   


    private void displayhandler()
    {
        if(t.isEmpty())
        {
            display1.setText("All rooms are empty");
        }
        else
        {   display1.setText("Room" + "\t" + "Name" + "\n");
            for(int i=0; i<=t.getTotal()-1; i++)
            {
               
               display1.appendText(t.getTenant(i).getName() + "\t\t\t" +  t.getTenant(i).getRoom() + "\n");
            }
        }
    }





    private void saveandquitehandler()
    {
        TenantFileHandler.saveRecords(getNumberOfRooms(), t);
        Platform.exit();
    }




    private void makepaymenthandler()
    {

        String roomEntered = roomField1.getText();
        String monthEntered = monthField.getText();
        String amountEntered = amounField.getText();
        
        if(roomEntered.length()== 0 || monthEntered.length()== 0 || amountEntered.length()== 0)
        {
        display2.setText("Room number, month and amount must all be entered");
        }
        else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered)>noofrooms)
        {
        display2.setText("Invalid room number");
        }
        else if(t.Search(Integer.parseInt(roomEntered)) == null)
        {
        display2.setText("Room number " + roomEntered + " is empty");
        }
        else 
        {
        Payment p = new Payment(monthEntered,Double.parseDouble(amountEntered));
        t.Search(Integer.parseInt(roomEntered)).makePayment(p);
        display2.setText("Payment recorded");
        } 
        
     }
    






    private void displaypaymenthamdler()
    {
        int i;
String roomEntered = roomField1.getText();

if(roomEntered.length()== 0)
{
display2.setText("Room number must be entered");
}
else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noofrooms)
{
display2.setText("Invalid room number");
}
else if(t.Search(Integer.parseInt(roomEntered)) == null)
{
display2.setText("Room number " + Integer.parseInt(roomEntered) + " is empty");
}
else 
    {
    Tenant tt = t.Search(Integer.parseInt(roomEntered));
    PaymentList p = tt.getPayments();
    if(tt.getPayments().getTotal() == 0)
    {
    display2.setText("No payments made for this tenant");
    }
    else
    {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String s;
    display2.setText("Month" + "\t\t" + "Amount" + "\n");
    for(i = 0; i <= p.getTotal()-1; i++ )
    {
    s = nf.format(p.getPayment(i).getAmount());
    display2.appendText("" + p.getPayment(i).getMonth() + "\t\t\t" + s + "\n");
    }
    display2.appendText("\n" + "Total paid so far : " +
    nf.format(p.calculateTotalPaid()));
    monthField.setText("");
    amounField.setText("");
    }
    }

    }

    public static void main(String[] args) {
        launch(args);
    }
}