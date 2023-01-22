import java.util.Scanner;

public class fiveorsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a,b,c;
        a =(n%5==0&&n%6==0);
        b =(n%5==0||n%6==0);
        c =(n%5==0^n%6==0);

        System.out.println("Is 10 divisible by 5 and 6? "+a);
        System.out.println("Is 10 divisible by 5 or 6? "+b);
        System.out.println("Is 10 divisible by 5 or 6 .But not both? "+c);

    }
}
