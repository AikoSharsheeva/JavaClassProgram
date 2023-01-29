package class12;

import java.util.Scanner;


public class methodsIntro {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Write the nme country, that you wanna travel to ");
//        String country = sc.nextLine();
//        travelTo(country);

        boolean result = canSleepIn(4, true);
        System.out.println(result);
    }

//    public static void travelTo(String country) {
//        System.out.println("I want to travel to " + country);
//    }

    public static boolean canSleepIn(int dayofweek, boolean isOnVacation) {
        if (isOnVacation) {
            return true;
        } else {
            if (dayofweek <= 5) {
                return false;

            } else if (dayofweek == 6 || dayofweek == 7) {
                return true;


            } else {
                return false;

            }
        }
    }
}