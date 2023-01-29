package class11;
import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {

//    Write a program that takes a day of the week as input (e.g., “Monday”),
//    and outputs the number of days until the next weekend (i.e., either Saturday or Sunday).
//    Use a switch statement to implement this program.
//    Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the day");

        String day=sc.nextLine();
        int remainder=0;
        switch (day) {
            case  "Monday":
                remainder = 5;
                break;
            case "Tuesday":
                ;
                remainder = 4;
                break;
            case "Wednesday":
                ;
                remainder = 3;
                break;
            case "Thursday":
                ;
                remainder = 2;
                break;
            case "Friday":
                ;
                remainder = 1;
                break;
        }
        System.out.println(" The number of days until the next weekend is " +remainder);

       // 2. Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two integers as input,
        // and outputs the result of the operation.
        // Use a switch statement to implement this program.
        // Make sure to consider the possibility of division by zero, and any other edge cases.
       // Sample outputs for input "+ 2 3" would be "5", input "/ 6 2" would be "3", input "* 7 8" would be "56",
        // if we have edge case input "/ 5 0" would be "division by zero is not allowed" or similar message
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter +,-,*,/");
        String operator= scanner.nextLine();
        System.out.println("Enter 1 number");
        int num1= scanner.nextInt();
        System.out.println("Enter 2 number");
        int num2= scanner.nextInt();
        if (num1==0 || num2==0){
            System.out.println("division by zero is not allowed");
        }
        switch (operator){
            case "+":
                System.out.println("Output " + (num1+num2));
                break;
            case "-":
                System.out.println("Output " + (num1-num2));
                break;
            case "*":
                System.out.println("Output " + (num1*num2));
                break;
            case "/":
                System.out.println("Output " + (num1/num2));
                break;
            default:
                System.out.println("Oops try again!");
        }
    }

}
