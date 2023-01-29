package class05;

public class HW5 {
    public static void main(String[] args) {
        boolean GiveFamilyHealthInsuranceCoverage=false;
        int AikoScore =999;
        boolean AikoMaritalStatus = true;
        int NumOfChildren =12;
        GiveFamilyHealthInsuranceCoverage= AikoScore>680 && AikoMaritalStatus==true&& NumOfChildren>2;
        System.out.println(GiveFamilyHealthInsuranceCoverage);
    }
}
