package class09;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("What is your gender? M or F");
        String gender= imput.next();
        char genderH = gender.charAt(0);
        if (genderH=='M' || genderH=='m') {
            System.out.println("Work hard");
        }

        else if (genderH=='F'|| genderH=='f') {
            System.out.println("enjoy your life");

        }
    }
}
