package class15;

public class Replace2 {
    public static void main(String[] args) {
//        Write a program that updates the first e in the second word X
        String str="DevX Adventures World";
        int indexOfFirstSpace=str.indexOf(" ");
        String noDevXReplaced=str.substring(indexOfFirstSpace).replaceFirst("e", "X");
        String devXOnly=str.substring(0,indexOfFirstSpace);
        String finalResult=devXOnly.concat(noDevXReplaced);
        System.out.println(finalResult);

    }
}
