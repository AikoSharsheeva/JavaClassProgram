package class14;

public class StringPractice2 {
    public static void main(String[] args) {
        String str = "<html>";
        str+= "<body>";
        str+="<h1> Hello Devx </h1>";
        str+= "<body>";
        str+="<html>";

        System.out.println(str);
         String str1="public class Hello";

//         concat method
//        \n creates new line
//        \t creates a tab
//        \" add as a String
//         \\ add \ as a string

         str1=str1.concat("{");
        System.out.println(str1);

        String str5="I ";
        str5.concat("Love");
        str5=str5.concat("Java");
        System.out.println(str5);

    }
}
