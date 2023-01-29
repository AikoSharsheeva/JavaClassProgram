package class15;

public class Contains {
    public static void main(String[] args) {
        String str="Hello, Askar! \n thank you for interviewing for Apple." +
                "We want to congratulate you on receving an offer";
//        contains method return  boolean (true/false)
//        returns true if the given String param exists
        boolean doesContain=str.contains("Apple");
        System.out.println(doesContain);

        if (str.contains("Apple")) {

        }

        String str2="Course Offering:Java,Python";
        if (str2.contains("JavaScript")) {
            //go and scehdule a call
            // and enroll
        }
        String anyOfWebsites="";
        if(anyOfWebsites.contains("Turkish rest near me"));

        //startsWith()
        //endWith()
        //isEmpty()
    }
}
