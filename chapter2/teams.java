import java.util.*;
public class teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_students, team_size;
        System.out.println("entern the total number of students");
        total_students= sc.nextInt();
        System.out.println("enter the size of one team");
        team_size=sc.nextInt();
        System.out.println("the total teams that can be formed are "+ total_students/team_size);
        System.out.println("the number of students remaining are "+ total_students%team_size);

    }
}
