package class15;

public class Replace {
    public static void main(String[] args) {
//        Returns new string by replacing all occurrences
//        of oldChar with new Char
//        String s1 = “feeksforfeeks“;
//        String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”
//        Note:- s1 is still feeksforfeeks and s2 is geeksgorgeeks



        String str="earth is flat";
        String str1=str.replace('a', 'W');
        System.out.println(str1);

        String str3="public static void main (String{} args)";
        String str4=str3.replace('{', '[');
        String str5=str4.replace('}', ']');
        System.out.println(str4);
        System.out.println(str5);


        String str6="public class replace{}";
        String str7=str6.replace('{','[').replace('}',']');
        System.out.println(str7);

        String str8="Rock and Roll, Spring Roll";
        String str9=str8.replace('o','B');
        System.out.println(str9);

        String str11="I hate java";
        System.out.println(str11.replace("hate", "love"));

        String str12="System.out.println(Hello World)";
        String str13=str12.replace("World)", "World);");
        System.out.println(str13);

        String str14="system";
        System.out.println(str14.replaceFirst("s","S"));


        String str15="I hate java, I hate Programming";
        System.out.println(str15.replaceFirst("hate","love"));

    }

}
