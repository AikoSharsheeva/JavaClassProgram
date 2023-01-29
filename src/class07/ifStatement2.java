package class07;
import java.util.Scanner;
public class ifStatement2 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        int age = input.nextByte();
        if (age>16){
            System.out.println("You are Eligible to Drive");
        }
        if (age<=16) {
            System.out.println("You are NOT Eligible to Drive");
        }

        byte fahrenheit= input.nextByte();
        if (fahrenheit<32) {
            System.out.println("It's Freezing.Stay Home");
        } else if (fahrenheit<41 && fahrenheit>=32){

                System.out.println("It's little chilly outside");
            }

    }
}
