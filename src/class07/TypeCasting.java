package class07;

public class TypeCasting {
    public static void main(String[] args) {
        double gasPrice=1.99;
       // int wholeNumber=gasPrice;//incompatible types compilation error

       // int b=10.5; //incompatible types compilation error
        int a =40;
       // short smallNum =a;//incopatible types compilation error
        //explicit type casting
        double price=2.99;
        //(int) is a type casting operator
        int convert = (int)price;
        System.out.println(convert);

        double num2 = 9.01;
        int convert2=(int) num2;
        System.out.println(num2);

        float floatNum=2.4f;
        byte convert3=(byte) floatNum;
        System.out.println(convert3);

        //implicit -> automatic casting
        int num1=24;
         double doubleNum=num1; //automatically adds .0 at the end
        System.out.println(doubleNum);//24

        int num5=55;
        double doubleNum2=num5;
        System.out.println(doubleNum2);

        double sold=4544950.96;
        byte clients = 64;
        double AverageCustomers=sold/clients;
        System.out.println(AverageCustomers);

        int miles=100;
        double gas=2.4;
        double milesperGallons= miles/gas;
        System.out.println(milesperGallons);

        System.out.println();



    }
}
