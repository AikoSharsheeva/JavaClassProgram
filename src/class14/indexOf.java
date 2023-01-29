package class14;

public class indexOf {
    public static void main(String[] args) {
//        indexOf return first index
//         Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified
//string. String s = ”Learn Share Learn”;
//int output = s.lastIndexOf("a"); // returns 14

        String str="tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));

        String str2="bla bla bla";
        System.out.println(str2.indexOf("vghkcfjcghj"));
        System.out.println(str2.indexOf("bla"));

        String str3="Macbook Air, Nuke Air, Ipod Air";
        System.out.println(str3.indexOf("Air",10));
        System.out.println(str3. indexOf("Air",19));

        String str4="Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("La",5));
        System.out.println(str4.indexOf("la",5));
        System.out.println(str4.indexOf("la",13));
        System.out.println(str4.indexOf("la",14));

        System.out.println("=================================");

//        lastIndexOf
        String str5="Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String str6="Almazova Almazova";
        int last2Chars=str6.lastIndexOf("va");
        System.out.println(last2Chars);


    }
}
