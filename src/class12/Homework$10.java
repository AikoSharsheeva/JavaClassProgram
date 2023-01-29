package class12;
import java.util.Scanner;
public class Homework$10 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your height in meters");
//        double meters= input.nextDouble();
//
//        System.out.println("Height in feet is " +metersToFeet(meters));
//        System.out.println("Height in inch is " +metersToInch(meters));
//    }
//    public static double metersToFeet(double meters) {
//        return meters*3.281;
//    }
//    public static double metersToInch(double meters) {
//        return meters*39.37;
//    }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your grade A, B, C, D, F");
//        char grade=sc.next() .charAt(0);
//        System.out.println(result(grade));
//
//    }
//
//    public static boolean result (char grade){
//    if (grade=='A'||grade=='B') {
//        System.out.println("You are passed");
//        return true;
//    } else{
//        System.out.println("You are failing");
//        return false;
//    }
        Scanner input=new Scanner(System.in);
        System.out.println("Are you member  of loyalty program?");
        boolean memberOfLoyalty= input.nextBoolean();
        System.out.println("Enter cost of of a purchase");
        double cost= input.nextDouble();
        double result=result(memberOfLoyalty,cost);
        System.out.println("Final cost of purchase is " +result);

    }

    public static double result(boolean memberOfLoyalty, double cost){
        if(memberOfLoyalty){
            return (cost-cost*0.1);
        }
        else{
            return cost;
        }
    }
}
