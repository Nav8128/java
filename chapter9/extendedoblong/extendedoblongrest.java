

public class extendedoblongrest {
   public static void main(String[] args) {
    extendedoblong st;
System.out.println("enter length of oblong");
double length = EasyScanner.nextDouble();
System.out.println("enter the height of oblong");
double height = EasyScanner.nextDouble();
System.out.println("enter the symbol");
char symbol = EasyScanner.nextChar();
st = new extendedoblong(length, height, symbol);
String s = st.draw();
System.out.println(s);

   }
   
}
