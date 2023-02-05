package loop;

import java.util.Scanner;
public class guess {
    static int a,b; //key is once given for encryption and decryption

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the key to be used in ciphering(a,b) : ");
        a=sc.nextInt();
        b=sc.nextInt();
        String cipheredText= ciphering();
        System.out.println("ciphered text is : "+ cipheredText);
        System.out.println("and deciphering text will be: ");
        String de=deciphering(cipheredText);
        System.out.println(de);
    }

    static String ciphering() {
        String plainText = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the text to be ciphered");
        plainText = sc.nextLine();//getting the user input
        String cipheredText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char t = plainText.charAt(i);//extracting the first character.
            int charNum = (char) t - 97;
            int c = (a * charNum + b) % 26;
            char newC = (char) (c + 97);
            cipheredText += newC;
        }
        return cipheredText;
    }
    static String deciphering(String cipher) {
        StringBuilder plainText= new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            char c = cipher.charAt(i);//extracting the first character.
            int charNum = (char) c - 97;
            int deciphered = ((modInverse(a)) * (charNum - b+26)) % 26;
            char newT = (char) (deciphered + 97);
            plainText.append(newT);
        }
        return plainText.toString();
    }
    static int modInverse(int a){
        a %= 26;
        for (int x = 1; x< 26; x++)
            if((a*x)% 26 ==1)
                return x;
        return 1;
    }
}