package class14;

public class Substring {
//    Return the substring from the ith  index character to end.
//            "DevXSchool".substring(3); // returns “XSchool”
//    String substring (int i, int j): Returns the substring from i to j-1 index.
//"DevXSchool".substring(2, 5); // returns “vXS

//     String concat( String str): Concatenates specified string to the end of this string.
//String s1 = ”DevX”;
//String s2 = ”School”;
//String output = s1.concat(s2); // returns “DevXSchool”

    public static void main(String[] args) {
        String str="Hello world";

        System.out.println(str.substring(6));
        System.out.println(str);


        String str1="Tesla Motors inc.";
        System.out.println(str1.substring(6));

//        System.out.println(str1.substring(20));

        String str2="La Ferrari";
        System.out.println(str2.substring(3,8));// 8 not include

        String str3="Maldive Islands";
        System.out.println(str3.substring(0,6));

        System.out.println(str3. substring(1,5));



    }
}
