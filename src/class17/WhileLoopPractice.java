package class17;

public class WhileLoopPractice {
    //write a program to Print
    //1 10 2 9 3 8 4 7 5 6
    public static void main(String[] args) {
        int num=0;
        int counter=10;
        while(num<=10) {
            System.out.println(num);
            num++;
        }

        int num2=1;
        int counter2=10;
        while(counter2>=6) {
            System.out.println(num2);
            num++;
            System.out.println(counter2);
            counter2--;
        }

        System.out.println("=============");
        int num3=1;
        while (num3<10) {
// in the body of the while i must have a  boolean expression updater
            System.out.println("Hello");
            num3++;//updater
        }

        //1 define the right starting point
        //2 define a boolean expression where
        //you are using
    }
}
