package class14;

public class CharAt {
    public static void main(String[] args) {
//        Returns the character at ith index.
//        "DevXSchool".charAt(3); // returns  ‘X

        String str="wedevx.co";
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(0));//w
        System.out.println(str.charAt(5));//x

        System.out.println("==============");


        String str2="hello world";
        System.out.println(str2.charAt(5));// space
// index out of bound
        String str3="Superstar";
        System.out.println(str3.charAt(8));

    }
}
