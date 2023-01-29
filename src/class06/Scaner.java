package class06;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        input. nextInt();
//        input. nextBoolean();
//        input. nextByte();
//        System.out.println("==============2


//       int age = input.nextInt();
//        System.out.println(age);
//
//        System.out.println("Please enter your credit score between 0-820");
//        int creditScore =input.nextInt();
//        System.out.println(creditScore);
//
//        System.out.println("What is your Marital status?");
//        String marriedStatus =input.next();
//        boolean status = input.nextBoolean();
//        System.out.println("your age is " + age + "\n your score is: " +creditScore + "\n What is your marital status "+ "");

        //write a program for login functionality
        //ask a user to input username
        //and password
        //if username is "best@devx.com"
        //password is "Fall2022"
        //then print out true
        //otherwise print out false

        System.out.println("Please enter your username");
        String Username = input.next();
        System.out.println("Please enter your password");
        String Password = input.next();
        boolean check = Username.equals("Aiko") && Password.equals("123456");
        System.out.println(check);



    }
}
