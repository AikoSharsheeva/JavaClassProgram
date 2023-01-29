package class17;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        //write program that prints out
        //every other character of a string

        //ex:Java
        //a a
        //Hello
        // e l
        //World
        // o l
        //Mission imposible
        //i so m o s i l
        String str1="Hello World from Mars";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(4));
        System.out.println("======");

        int i=1;
        while (i<str1.length()) {
            char newchar=str1.charAt(i);
        i=i+2;
            System.out.println(newchar);
        }
    }
}
