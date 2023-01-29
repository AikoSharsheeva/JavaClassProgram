package class08;
import java.util.Scanner;
public class ElseIF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean hasLicenses=true;
        int speed=90;
        if (hasLicenses && speed<80) {
            System.out.println("Have a safe journey");
        }
         else if (hasLicenses && speed>80){
            System.out.println("here is your speed ticket");
        }
         else if (!hasLicenses && speed<80){
            System.out.println("We have  to tow yor car");
        }
         else if (!hasLicenses && speed>80){
            System.out.println("You must appear in the court");
        }

    }
}
