package La5;

import java.util.Scanner;

public class q8 {

    private static final int alphabets =26;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Message : ");
        String message = sc.nextLine();
        System.out.print("Enter KEY pair (a & b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s=encrypt(message,a,b);
        System.out.println("Encrypted message: "+s);
        System.out.println("Decrypted message: "+decrypt(s,a,b));
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
