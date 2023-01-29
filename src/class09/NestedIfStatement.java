package class09;
import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args) {
        boolean outerBoolean = true;
        boolean innerBoolean = false;


        if (true) {
            System.out.println("Outer Hi 5.1");

            if (true) {
                System.out.println("Inner Hi 5");
            }
            System.out.println("Outer Hi 5.2");
        }
        if (true) {
            System.out.println("Outer Hi 7.1");
            if (false) {
                System.out.println("Inner If Hi 8");
            }
                    System.out.println("Outer Else 8");
                }

        // Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary  ");
        int salary= input.nextInt();

        System.out.println("Enter your age  ");
        int age= input.nextInt();

        if (age<18) {
            System.out.println("Sorry, you're not elights");
            if (age > 18 && salary < 5000) {
                System.out.println("Sorry, you need work hard");
            }
        }
            }
        }





