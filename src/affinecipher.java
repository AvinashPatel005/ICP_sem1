import java.util.Scanner;

public class affinecipher {

    private static final int alphabets =26;
    public static String encrypt(String plaintext , int x ,int y){
        String encrypted="";
        plaintext=plaintext.toLowerCase();
        for (int i = 0;i<plaintext.length();i++){
            char alpha = plaintext.charAt(i);
            if(alpha>='a' && alpha<='z') encrypted += (char) ((x * (alpha- 'a') + y) % alphabets + 'A');
            else encrypted += alpha;
        }
        return encrypted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Message to encrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter KEY pair (a & b) << a is coprime with 26 >> :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = encrypt(message, a, b);
        System.out.println("Encrypted message: " +s);
        System.out.println("Decrypted message: " + decrypt(s, a, b));
        sc.close();
    }
    public static String decrypt(String ciphered,int x ,int y){
        String deciphered ="";
        int inv=0;
        for(int j = 0; j<= alphabets; j++){
            if((x*j)% alphabets ==1){
                inv=j;
                break;
            }
        }
        for (int i = 0; i< ciphered.length(); i++){
            char ch = ciphered.charAt(i);
            if(ch>='A'&&ch<='Z'){
                deciphered += (char)((((ch- 'A' - y + alphabets)*inv)% alphabets)+'a');
            }
            else deciphered += ch;
        }
        return deciphered;
    }
}
