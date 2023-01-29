package class06;

public class ConditionalOR {
    public static void main(String[] args) {
        //Conditional
        int age = 61;
        boolean giveDiscount = age > 60 || age < 8;
        System.out.println(giveDiscount);
        //difference between 60> all conditions must be true
        //|| at least one of them must true

        int currenTime = 13;
        //drink coffee should be true if current time is 6-11.
        boolean drinkcoffee = currenTime > 6 && currenTime < 11;
        System.out.println(drinkcoffee);

        //when to relax
        // if complited 5 java exercises
        //or if you recorded  2 soft-skills videos

        int javaExercises = 13;
        int softSkillsVideos = 1;
        boolean toRelax = javaExercises >= 5 && softSkillsVideos >= 2;
        System.out.println(toRelax);//False

        System.out.println("=============================================");

        //Banking industry application
        //when should the bank account be blocked?
        //login Attempts more than 3
        // transaction amount is more than  $3000
        //location of transaction > must match your current location

        int numberOfLoginAttemps = 5;
        double transactionAmount = 7777.00;
        String locationOfTransaction = "USA";
        boolean block = numberOfLoginAttemps >= 3 && transactionAmount > 3000.00 && locationOfTransaction != "USA";
        System.out.println(block);


        //login Functionality
        //Write a logic which would  tell the user  if logged in or not
        // you have a userName
        // you have a passport
        //you loginLocation

        //in order to be logged  your username should match steve@apple.com
        //and your password should be infinityLoop1
        //and you location should be california


        boolean logIn = true;


    }
}
