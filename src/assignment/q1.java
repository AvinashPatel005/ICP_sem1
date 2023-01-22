package assignment;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        int max = Math.max(n1,Math.max(n2,n3));
        System.out.println("The Largest Number is "+max);

    }
}
