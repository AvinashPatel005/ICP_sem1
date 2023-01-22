import java.util.Scanner;

public class future {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter today's Day :");
        int n = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int f = sc.nextInt();
        String tday,day;
        int temp=n+f;

        switch(n){
            case 0: tday = "sunday";
                break;
            case 1: tday = "monday";
                break;
            case 2: tday = "tuesday";
                break;
            case 3: tday = "wednesday";
                break;
            case 4: tday = "thursday";
                break;
            case 5: tday = "friday";
                break;
            case 6: tday = "saturday";
                break;
            default: tday="Not Valid";
        }
        switch(temp%7){
            case 0: day = "sunday";
                break;
            case 1: day = "monday";
                break;
            case 2: day = "tuesday";
                break;
            case 3: day = "wednesday";
                break;
            case 4: day = "thursday";
                break;
            case 5: day = "friday";
                break;
            case 6: day = "saturday";
                break;
            default: day=null;
        }
        System.out.println("Today is "+tday+". The future day is "+day+".");
    }
}
