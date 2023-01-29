package class11;
import java.util.Scanner;
public class Practice {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Write 1 number");//8
        int num1= input.nextInt();
        System.out.println("Write 2 number");//6
        int num2= input.nextInt();
        System.out.println("write 3 number");//-5
        int num3= input.nextInt();
        int sum=num3+num1*num2;
        System.out.println("sum is " +sum);

        System.out.println("Write 4 number");//55
        int num4=input.nextInt();
        System.out.println("Write 5 number");//9
        int num5=input.nextInt();
        System.out.println("Write 6 number");//9
        int num6=input.nextInt();
        int sum2=(num4+num5)%num6;
        System.out.println("Sum2 is "+sum2);

        System.out.println("write 7 number");//20
        int num7=input.nextInt();
        System.out.println("write 8 number");//-3
        int num8=input.nextInt();
        System.out.println("write 9 number");//5
        int num9=input.nextInt();
        System.out.println("write 10 number");//8
        int num10=input.nextInt();
        int sum3=num7+num8*num9/num10;
        System.out.println("Sum3 is " +sum3);


        System.out.println("Write 11 number");//5
        int num11= input.nextInt();
        System.out.println("Write 12 number");//15
        int num12=input.nextInt();
        System.out.println("Write 13 number");//3
        int num13=input.nextInt();
        System.out.println("Write 14 number");//2
        int num14=input.nextInt();
        System.out.println("Write 15 number");//8
        int num15=input.nextInt();
        System.out.println("Write 16 number");//3
        int num16=input.nextInt();
        int sum4=num11+num12/num13*num14-num15%num16;
        System.out.println("Sum4 is " +sum4);


        System.out.println("Write 17 number");//25
        int num17=input.nextInt();
        System.out.println("Write 18 number");
        int num18= input.nextInt();//5
        int sum5=num17*num18;
        System.out.println("Sum5 is " +sum5);//125

        System.out.println("======================================");
        Scanner in=new Scanner(System.in);
        System.out.println("Write 8");
        int num19=in.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(num19 +"x" +(i+1) + "=" +(num19 *(i+1)));
        }

        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
}
