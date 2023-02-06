import java.util.Scanner;

public class AffineChiper {

    private static final int alphabets =26;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (i==1) {
            System.out.print("Enter 1>>Encryption 2>>Decryption 3>>End: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Message to encrypt: ");
                    String message = sc.nextLine();
                    System.out.print("Enter KEY pair (a & b) << a is coprime with 26 >> :");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Encrypted message: " + encrypt(message, a, b));
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.print("Ent1er the Message to Decrypt: ");
                    String messageToDecrypt = sc.nextLine();
                    System.out.print("Enter KEY pair (a & b): ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Decrypted message: " + decrypt(messageToDecrypt, x, y));
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("Thank You");
                    i=0;
                    break;
                default:
                    System.out.println("Enter valid input!");
            }
        }
    }
    public static String encrypt(String plaintext ,int a ,int b){
        String encrypted="";
        for (int i = 0;i<plaintext.length();i++){
            char ch = plaintext.charAt(i);
            if(ch>='a' && ch<='z'){
                encrypted += (char)((a*(ch-'a')+b)% alphabets +'A');
            }
            else if(ch>='A' && ch<='Z'){
                encrypted += (char)((a*(ch-'A')+b)% alphabets +'a');
            }
            else encrypted += ch;
        }
        return encrypted;
    }
    public static String decrypt(String encrypted ,int a ,int b){
        String decrypted="";
        int inv=0;
        for(int j = 0; j<= alphabets; j++){
            if((a*j)% alphabets ==1){
                inv=j;
                break;
            }
        }
        for (int i = 0;i<encrypted.length();i++){
            char ch = encrypted.charAt(i);

            if(ch>='a' && ch<='z'){
                decrypted += (char)((((ch- 'a'- b + alphabets)*inv)% alphabets)+'A');
            }
            else if(ch>='A'&&ch<='Z'){
                decrypted += (char)((((ch- 'A' - b + alphabets)*inv)% alphabets)+'a');
            }
            else decrypted += ch;
        }
        return decrypted;
    }
}
