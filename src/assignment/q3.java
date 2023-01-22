package assignment;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Month Number: ");
        int m = sc.nextInt();
        sc.close();
        if (m <= 12) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println("31 Days are in this Month.");
            } else if (m == 2) {
                System.out.println("Either 28 or 29 Days are in this Month.");
            } else {
                System.out.println("30 Days are in this Month.");
            }
        }
        else System.out.println("Not a valid Month Number. Please Enter Number between 1 and 12.");
    }
}
