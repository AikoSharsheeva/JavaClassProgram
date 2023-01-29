package class14;
import java.util.Scanner;
public class Homework12 {
    public static void main(String[] args) {
//        Homework 1:
//Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.
//Homework 2:
//Write a method that takes a string   returns a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//extraEnd(“Hi”) → “HiHiHi”
//extraEnd(“Hello”) → “lololo”
//extraEnd(“ab”) → “ababab”
//Homework 3:
//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so “coding” yields “codign”.
//lastTwo(“coding”) → “codign”
//lastTwo(“cat”) → “cta”
//lastTwo(“ab”) → “ba”

      Scanner aiko=new Scanner(System.in);
        System.out.println("Enter something");
        String string= aiko.nextLine();
        System.out.println(isStarsWithHi(string));

        System.out.println("Enter word");
        String string2= aiko.nextLine();
        System.out.println(last2Chars(string2));





    }
     public static boolean isStarsWithHi(String string) {
        return  string.startsWith("Hi");
     }
     public static String last2Chars(String str){
        String repeat=str.substring(str.length()-2);
         return repeat.concat(repeat).concat(repeat);
     }


     }


