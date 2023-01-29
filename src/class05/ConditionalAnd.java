package class05;

public class ConditionalAnd {
    public static void main(String[] args) {
        boolean giveAikoCertificate=false;
        double aikoGPA=4.0;
        int AikoMissedClasses=2;
        giveAikoCertificate=aikoGPA>3.5 && AikoMissedClasses<3;
        System.out.println(giveAikoCertificate);

        boolean GiveraimCertificate;
        double raimGPA=4.5;
        int raimMissedClass=2;
        GiveraimCertificate=raimGPA>3.5 && raimMissedClass<3;
        System.out.println(GiveraimCertificate);

        boolean issueDriverlicence=false;
        int MyAge =18;
        boolean AikoPassport=true;
        issueDriverlicence= MyAge>16 && AikoPassport==true;
        System.out.println(issueDriverlicence);

    }

}
