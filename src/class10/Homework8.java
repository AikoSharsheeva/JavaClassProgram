package class10;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Write a program for online shopping website:
//        An online shopping website uses a nested if statement to determine the shipping cost for an order based on the weight of the order and the shipping destination.
//                Take user inputs for:
//        double weight, destination.
//        If the weight of the order is less than 2 lbs and the shipping destination is within the United States, the shipping cost is $5.
//        If the weight of the order is 2 lbs or more and the shipping destination is within the United States, the shipping cost is calculated based on the weight of the order. users pay 50 cents per lbs.
//                If the shipping destination is outside the United States, the shipping cost is calculated based on the weight of the order at special rate. $1.5 per lbs.
        System.out.println("Enter Destination");
        String destination = input.nextLine();
        System.out.println("Enter Weight in lbs");
        double weight = input.nextDouble();


        if (destination.equalsIgnoreCase("United State") || destination.equalsIgnoreCase("US") || destination.equalsIgnoreCase("USA"))
            if (weight < 2) {
                System.out.println("Shipping cost is 5$");
            } else {
                System.out.println(weight / 2 + "$");
            }

        else {
            System.out.println(weight * 1.5 + "$");
        }

//        Nested If statements homework 3:
//        Write a bank app to calculate interest rates on loans:
//        take input for loanAmount in $,  credit score between 300-850.
//        If the loan amount is less than $10,000 and the credit score is less than 600, the interest rate is set to 15%.
//        If the loan amount is less than $10,000 and the credit score is 600 or higher, the interest rate is set to 10%.
//        If the loan amount is $10,000 or higher and the credit score is less than 600, the interest rate is set to 12%.
//        If the loan amount is $10,000 or higher and the credit score is 600 or higher, the interest rate is set to 8%.
//        Print out the interest rate.
//                Example output:
//        Please enter how much you want to loan:
//        9000
//        Please enter your credit score:
//        750
//        Your interest rate is 10%.

        System.out.println("Please enter how much you want to loan: $");
        int loanAmount = input.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = input.nextInt();
        if (loanAmount < 10000 && creditScore < 600) {
            System.out.println("Your interest rate is 15%.");
        } else if (loanAmount < 10000 && creditScore >= 600) {
            System.out.println("Your interest rate is 10%.");
        } else {
            if (loanAmount >= 10000 && creditScore < 600) {
                System.out.println("Your interest rate is 12.");
            } else {
                if (loanAmount >= 10000 && creditScore >= 600) {
                    System.out.println("Your interest rate is 8%.");
                }
            }
        }
    }
}