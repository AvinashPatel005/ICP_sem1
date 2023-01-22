package assignment;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciiVal = sc.next().charAt(0);
        sc.close();
        if (asciiVal>=97 && asciiVal<=122)
            System.out.println("It is Lowercase.");
        else if (asciiVal>=65 && asciiVal<=90)
            System.out.println("It is Uppercase.");
        else
            System.out.println("Its not an Alphabet.");
    }
}
