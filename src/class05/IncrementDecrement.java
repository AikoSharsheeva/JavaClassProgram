package class05;

public class IncrementDecrement {
    public static void main(String[] args) {

        double gasPrice =3.99;
        gasPrice++;
        System.out.println(gasPrice); //4.99

        double gasPriceAftertax = gasPrice++;
        System.out.println(gasPriceAftertax);//4.99

        int num =1;
        int y=num++;
        System.out.println(num);//2
        System.out.println(y);//1

        int x=1;
        int w =++x;
        System.out.println(x);//2
        System.out.println(w);//2

        int z =10;
        int r=z++;
        System.out.println(z);//11
        System.out.println(r);//10

        System.out.println(z++);//11 one line where  you are post incrementing the returned  value
        // is still going to be old one.

        System.out.println(z);//12 next line when you use the incremented variable  it will return the new value.
        System.out.println("===================");

        int u =11;
        int q=u++;//q=11; u=12;
        int t =q++;//t=11; q=12;

        System.out.println(u);//12
        System.out.println(q);//12
        System.out.println(t);//11


        int numberOfClients =0;
        numberOfClients++;
        System.out.println(numberOfClients);//1

        numberOfClients++;
        System.out.println(numberOfClients);//2

        numberOfClients++;
        System.out.println(numberOfClients);//3

       int ab=50;
       int ac=ab++;//ac=50; ab=51;
       int ad=++ab; //ad=52 ab=52;
        System.out.println(ad++);//52
        System.out.println(++ab);//53


        System.out.println(ab++);//53
        System.out.println(ab++);//54

        System.out.println("Example");

        int var1=20;
        System.out.println(var1++);//20
        System.out.println(var1);//21
        System.out.println(++var1);//22
        int var2= var1++;//23=>
        System.out.println("hello");
        System.out.println(var2);//22
        int var3=++var1;//24
        System.out.println(var1);//24
        System.out.println(var2);//22
        System.out.println(var3);//24
    }
}

