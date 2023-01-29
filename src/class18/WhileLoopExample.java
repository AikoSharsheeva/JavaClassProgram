package class18;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            i++;
            System.out.println(i);
        }

        int aiko = 1;
        while (aiko <= 10) {
            if (aiko % 3 == 0) {
                aiko = aiko + 2;
            }
            i++;
            System.out.println(aiko);
        }
    }
}
