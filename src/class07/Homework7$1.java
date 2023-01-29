package class07;

import java.util.Scanner;

public class Homework7$1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /**   Write a program to print a welcome message to the passenger and
       notify them to do security checks if they are not coming from connecting flight,
                and at the end print "enjoy your flight"

        Example 2:
        Welcome to the Delta Air Lines
        Are you travelling from connecting flight(true/false)? false
        Please proceed to the security check
        Enjoy your flight
     */

        System.out.println("Welcome");
        System.out.println("Are you travelling from connecting flight?");
        boolean isConnecting=input.nextBoolean();
        if (isConnecting) {
            System.out.println("Please proceed to the security check");
        }
        System.out.println("Enjoy your flight");





        System.out.println("Welcome");
        System.out.println("Are you travelling from connecting flight?");
        String isConnecting2=input.next();

        if (isConnecting2.equals("yes")){
            System.out.println("Please proceed to the security check");
        }

        System.out.println("Enjoy your flight");


        boolean doesHaveDriveLicense=false;
        if (doesHaveDriveLicense) {
            System.out.println("give ticket");
        }


    }

}
