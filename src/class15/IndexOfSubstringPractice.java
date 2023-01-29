package class15;

public class IndexOfSubstringPractice {
    public static void main(String[] args) {
        String str="I love 5am waking up at";
        int length="5am".length();
        int indexOf5am=str.indexOf("5am");
        System.out.println(str.substring(indexOf5am, indexOf5am+ length));
    }
}
