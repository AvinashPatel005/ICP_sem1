import java.util.Scanner;

public class rps {
    public static void main(String[] args) {

        int comp = (int) (Math.random()*3);
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("(");
        boolean isValid = true;
        switch (comp){
            case 0: System.out.print("The computer is Scissor.");
                break;
            case 1: System.out.print("The computer is Rock.");
                break;
            case 2: System.out.print("The computer is Paper.");
        }
        switch (user) {
            case 0:
                System.out.print("You are Scissor");
                break;
            case 1:
                System.out.print("You are Rock");
                break;
            case 2:
                System.out.print("You are Paper");
                break;
            default:
                isValid = false;
        }
            if(isValid) {
                  if (user - comp == 1 || user - comp == -2) {
                     System.out.print(". You won.");
                  }
                  else if (user == comp) {
                       System.out.print(" too. It is a draw.");
                    }
                  else {
                      System.out.print(". Computer won.");
                  }
            }
            else System.out.print("You chose invalid number.");
    }
}
