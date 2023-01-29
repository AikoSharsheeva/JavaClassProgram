package class10;

import java.util.Scanner;

public class NestedRecap {
    public static void main(String[] args) {

        //1. Determining the minimum of three numbers:
//ask the user to input 3 integer numbers
//write a logic that will print out the largest number


        Scanner input = new Scanner(System.in);
        System.out.println("Write 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + "  is the largest");
        }

        //let's design the logic for restaraunt app
//first users should be given 2 options:
//appetizer or main course
//if user picks appetizers
//we should show users 2 appeterizer.
//1: spring rolls
//2: egg rolls
//once user is shown appetizer options they should be able select one
//appetizer.
//if user selects spring roll: print out spring roll ingredients
///if user selects egg roll: print out egg roll ingredients

//if user picks main course
//show
//1. Lagman
//2. New York Rib Eye steak
//if user selects Lagman: print out Lagman  ingredients
//if user selects New York Rib Eye steak: print out New York Rib Eye steak ingredients

        System.out.println("1. Main course");
        System.out.println("2. Appetizer");
        System.out.println("3. Drinks");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();
        if (choice1.equalsIgnoreCase("Main course") || choice1.equals("1")) {
            System.out.println("1. Lagman");
            System.out.println("2. NYC Steak");

            String MainCourse = sc.nextLine();

        if (MainCourse.equalsIgnoreCase("Lagman") || choice1.equals("1")) {
            System.out.println("Lagman ingrediends");
        } else if (MainCourse.equalsIgnoreCase("NYC Steak") || MainCourse.equals("2")) {
            System.out.println("NYC Steak ingrediends");
        } else {
            System.out.println("invalid Main course");
        }

        }  if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1. String rolls");
            System.out.println("2. Egg rolls");
            String appetizer = sc.nextLine();
             if (appetizer.equalsIgnoreCase("String rolls") || appetizer.equals("1")) {
                System.out.println("String rolls ingrediends");
            } else if (appetizer.equalsIgnoreCase("Egg rolls") || appetizer.equals("2")) {
                System.out.println("Egg rolls ingrediends");
            } else {
                 System.out.println("invalid appetizer");
             }


            }  if (choice1.equalsIgnoreCase("Drinks") || choice1.equals("3")) {
                System.out.println("Orange juice");
                System.out.println("Apple juice");
                System.out.println("Pineapple juice");
                String drinks = sc.nextLine();
             if (drinks.equalsIgnoreCase("Orange juice") || drinks.equals("1")) {
                    System.out.println("Orange juice ingrediends");
                } else if (drinks.equalsIgnoreCase("Apple juice") || drinks.equals("2")) {
                    System.out.println("Apple juice ingrediends");
                } else if (drinks.equalsIgnoreCase("Pineapple juice") || drinks.equals("3")) {
                    System.out.println("Pineapple juice ingrediends");
                } else {
                    System.out.println("Invalid drinks");
                }
            }
        }

    }




