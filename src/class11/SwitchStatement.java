package class11;

public class SwitchStatement {
    public static void main(String[] args) {
        int rate=1;
        switch (rate){
            case 1:
                System.out.println("Awful service");
                //break statement is an optional statement
                //when you want to end the switch statement with the logic of the case
                break;
            case 2:
                System.out.println("Extremely poor service");
                break;
            case 3:
                System.out.println("Bad service");
        }
        String shipmentStete="Hawaii";
        switch (shipmentStete) {
            case "Alaska":
            case "Hawaii":
                System.out.println("shippment cost is 10$");
                break;
            case "NY":
                System.out.println("shippment cost is 5$");
                break;
            case "Florida":
                System.out.println("shippment cost is 7$");
                break;
            case "California":
                System.out.println("shippment cost is 12$");
                break;
        }
//        Example
//        Input - 1,  Output - 31 days
//        Input - 2,  Output - 28/29 days
//        Input - 3,  Output - 31 days
//        Input - 4,  Output - 30 days
//        Input - 5,  Output - 31 days
//        Input - 6,  Output - 30 days
//        Input - 7,  Output - 31 days
//        Input - 8,  Output - 31 days
//        Input - 9,  Output - 30 days
//        Input - 10,  Output - 31 days
//        Input - 11,  Output - 30 days
//        Input - 12, Output - 31 days
        int num=5;
        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28-29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Sorry try again");


        }
    }
}
