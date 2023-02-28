package LabTestSample;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade");

        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("2000");
                break;
            case 'b':
                System.out.println("1500");
                break;
            case 'c':
                System.out.println("500");
                break;
            default:
                System.out.println("100");
        }
    }
}
