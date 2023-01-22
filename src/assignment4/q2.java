package assignment4;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check divisibility by 9 :");
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            sum = sum+(temp%10);
            temp=temp/10;
        }

        if(sum%9==0) System.out.println("The number " +n+ " is divisible by 9");
        else System.out.println("The number " +n+ " is not divisible by 9");
    }
}
