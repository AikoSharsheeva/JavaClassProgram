package class11;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        //Online store.
// we want to write a program which calculates shipping cost based on
//destination and based on total spending
//if the customer is spending less than $5 than charge $5 for shipping
//if spending more than 5 and less or equal to $10 then charge $10


//if spending more than 10 then.
//we also look at the shipping destination.
//if it's usa -> we should charge 10% of the total spending for shipping
//if it's canada -> charge 15% of total spending
//if it's Europe -> charge 20% of total spending
//if it's any other place -> charge 25% of total spending
        Scanner sc =new Scanner(System.in);
        double totalSpending;
        String country;


        System.out.println("Please enter total customer spending:");
        totalSpending = sc.nextDouble();
        switch ((int) totalSpending){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Your shipping price is $5");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Your shipping price is $10");
            default:
                System.out.println("Please enter the shipping country:");
                country = sc.nextLine();
                switch (country){
                    case "USA":
                    case "United States":
                        System.out.println("Your shipping price is $"+totalSpending/100*10);
                        break;
                    case "Canada":
                        System.out.println("Your shipping price is $"+totalSpending/100*15);
                        break;
                    case "Europe":
                        System.out.println("Your shipping price is $"+totalSpending/100*20);
                        break;
                    default:
                        System.out.println("Your shipping price is $"+totalSpending/100*25);
                }

        }
    }
}