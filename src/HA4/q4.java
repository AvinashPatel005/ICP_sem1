package HA4;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("For input, N=");
        int n = sc.nextInt();
        int se=0,sp=1;
        for(int i = 1 ;i<=n;i++){
            if(i%2==0) se+=i;
            else sp*=i;
        }
        System.out.println("The sum of all Even = "+se);
        System.out.println("The product of all Odd = "+sp);
    }
}
