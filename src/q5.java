import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char g = sc.nextLine().toLowerCase().charAt(0);
        String s = "Then I shall call you ";
        if (g == 'f' || g == 'm') {
            System.out.print("First Name: ");
            String fn = sc.nextLine();

            System.out.print("Last Name: ");
            String sn = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            if (g == 'm') {
                if(age>=20) System.out.println(s+"Mr. "+fn);
                else System.out.println(s+fn+" "+sn);
            }
            else {
                char m;
                if(age>=20){
                    System.out.println("Are you married, Gita (y or n)? ");
                    m = sc.next().toLowerCase().charAt(0);
                    if(m=='y') System.out.println(s+"Mrs. "+fn+" "+sn);
                    else System.out.println(s+"Ms. "+fn);
                }
                else System.out.println(s+fn+" "+sn);
            }

        }
        else System.out.println("Enter valid Input.");
    }
}
