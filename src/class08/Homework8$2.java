package class08;
import java.util.Scanner;
public class Homework8$2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The name of the day is ");

        int num= input.nextInt();
        if (num==0) {
            System.out.println("Sunday");
        } else if(num==1) {
            System.out.println("Monday");
        } else if (num==2) {
            System.out.println("Tuesday");
        } else if (num==3) {
            System.out.println("Wednesday");
        } else if (num==4) {
            System.out.println("Thursday");
        } else if (num==5) {
            System.out.println("Friday");
        } else if (num==6) {
            System.out.println("Saturday");
        } else if (num==7) {
            System.out.println("Invalid Input");
        }

        System.out.println("Welcome to the Beverly Hills");
        boolean travelingFirstTime=true;
        if (travelingFirstTime) {
            System.out.println("Enjoy your stay");
        } else if (!travelingFirstTime) {
            System.out.println("You have got a 10% discount on your stay");
            System.out.println("Enjoy your stay");
        }














    }
}
