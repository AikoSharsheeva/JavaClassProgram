package class08;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input:  ");
        int num =input.nextInt();
        if (num %2==0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");

        }


    }
}
