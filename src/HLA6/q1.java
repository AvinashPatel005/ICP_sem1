package HLA6;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) count++;
            }
            if(count==1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
