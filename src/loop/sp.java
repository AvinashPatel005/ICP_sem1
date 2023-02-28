package loop;

import java.util.Scanner;
public class sp {
    public static boolean isPrime(int n) {
        int count=0;
        for(int i =2;i<=n/2;i++){
            if(n%i==0) count++;
        }
        return count==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =2;i<=num/2;i++){
            if(isPrime(i)&&isPrime(num-i)){
                System.out.println(i+"+"+(num-i)+"="+num);
            }
        }
    }
}
