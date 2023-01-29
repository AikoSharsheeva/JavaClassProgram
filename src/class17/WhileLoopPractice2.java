package class17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        //Write a program to print out all character in a string

        String str = "Let's go Mars";
        //do i know many times my loop should be iterated?
        int startingIndex = 1;
        //if you need increment then use < hom many time you need to run
        while (startingIndex < 13) {
            char eachChar = str.charAt(startingIndex);
            System.out.println(eachChar);
            startingIndex++;
        }

        String str2 = "Java";
        int rightStartingPoint = 4;
        while (rightStartingPoint > 0) {
            rightStartingPoint--;
            char eachcharacter = str2.charAt(rightStartingPoint);
            System.out.println(eachcharacter);

        }
        System.out.println("=========");
        String str3="Space Mars Mission";
        int index=str2.length()-1;
        System.out.println(index);

        while (index>=0){
            System.out.println(str2.charAt(index));
        }


    }
}
