package assignment4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b =sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c =sc.nextInt();


        for(int i = a;i<=b;i=i+c){
            System.out.print(i+" ");
            sum = sum+i;
        }
        System.out.println();
        System.out.println("The sum of numbers displayed is "+sum);
    }
}
