package class09;
import java.util.Scanner;
public class Homework9$1 {
    public static void main(String[] args) {
       /*Write a program to find the greatest number out of three numbers using nested if statement**
>

**Question Type:** Write Code.

## Test Data:

```java
        Example 1:
        Input - 43, 54, 24
        Output - 54 is the greatest
```

```java
        Example 1:
        Input - 53, 21, 65
        Output - 65 is the greatest
```


        2)> **Write a program to get a salary, age, and loan amount from the user and print how much credit card limit they can avail, based on the following criteria**
>

**Question Type:** Write Code.

## Test Data:

```java
                Salary
        ----------------------------------------------
                less than 1000              Not Eligible
        1001 to 5000                limit 10000
        5001 to 10000               limit 20000
        greater than 10001          limit 50000
                ----------------------------------------------

        Age should be greater than or equal to 18

        Loan Amount
        ---------------------------------
                less than 5000           No Deduction In Limit
        greater than 20000       Not Eligible
        5001 to 20000            Deduct Half Of The Loan Amount From Credit Card Limit
        ---------------------------------

                Note - If Credit Limit Turns Negative, Print - You Are Not Eligibile
                */
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1  ");
        int num1 = input.nextInt();
        System.out.println("Number 2  ");
        int num2 = input.nextInt();
        System.out.println("Number 3  ");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is the greatest");
        }

        System.out.println("Number 4 ");
        int num4 = input.nextInt();
        System.out.println("Number 5 ");
        int num5 = input.nextInt();
        System.out.println("Number 6");
        int num6 = input.nextInt();
        if (num4 < num6 && num5 < num6) {
            System.out.println(num6 + " is the greatest");
        }


        System.out.println("Enter you age: ");
        int age = input.nextInt();
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("Enter your loan");
        int loan = input.nextInt();
        if (age < 18 || salary <= 1000){
            System.out.println("Not Eligible");
        }
        else {
            if (salary <= 5000) {
                System.out.println("Your limit 10 000");
            } else if (salary <= 10000) {
                System.out.println("Your limit is 20 000");
            } else {
                System.out.println("Your limit is 50 000");
            }
        }

            if (loan <= 5000) {
                System.out.println("No deduction in limit");
            }
                else if(loan<=20000){
                    System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");
                }
                else {
                    System.out.println("You Are Not Eligibile");
                }
            }
        }


