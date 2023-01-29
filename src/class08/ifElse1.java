package class08;

import  java.util.Scanner;
public class ifElse1 {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        boolean doesHaveLicenses = false;
        if (doesHaveLicenses) {
            System.out.println("have a safe trip");
        }
        if(!doesHaveLicenses) {
            System.out.println("Here is your ticket");
        }

        if (doesHaveLicenses) {
            System.out.println("Have a safe Trip!");
        }
        else{
            System.out.println("here is your ticket");
        }

        boolean haslicenses=true;
        int speed=70;
        if (haslicenses && speed<80) {
            System.out.println("Have a safe journey");
        }
        else{
            System.out.println("here is your ticket");
            System.out.println("Please obey the rules");

        }

        /**
         * Write a program to get the salaries of two-person and print the name of the person that has a greater salary
         * Question Type: Write Code.
         * Test Data:
         * Example 1
         * Person 1: 1200
         * Person 2: 2500
         * Output: 2500
         *
         * Example 2:
         * Person 1: 4500
         * Person 2: 8600
         * Output: 8600
         */


        System.out.println("the name of the person");
        int person1= input.nextInt();
        int person2= input.nextInt();
        if (person1>person2) {
            System.out.println(person1);
        }
        else{
            System.out.println(person2);
        }

        System.out.println("the name of the person");
        int person11= input.nextInt();
        int person22= input.nextInt();
        if (person11>person22){
            System.out.println(person11);
        }
        else{
            System.out.println(person22);
        }

    }
}
