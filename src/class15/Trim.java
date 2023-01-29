package class15;

public class Trim {
    public static void main(String[] args) {

//        Returns the copy of the String, by removing whitespaces at both ends. It does not
//        affect whitespaces in the middle.
//                String word1 = “ Learn Share Learn “;
//        String word2 = word1.trim(); // returns “Learn Share Learn

        String str="Elon";
        boolean isEqual=str.equals("Elon");
        System.out.println(isEqual);
        String answer="                Yes                     ";
       boolean yesOrNo=answer.equalsIgnoreCase("yes");
       System.out.println(yesOrNo);
        System.out.println(answer.trim());//return yes without the space

        String aiko=" Aiko is cool ";
        boolean right=aiko.equalsIgnoreCase("Aiko is cool");
        System.out.println(right);
        System.out.println(aiko.trim());


        switch (answer.toLowerCase().trim()) {}

    }

}
