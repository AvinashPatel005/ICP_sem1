package loop;

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        System.out.println("Enter a series:");
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        int l=0;
        for(int i=0;i<100;i++){
            a[i]=sc.nextInt();
            if (a[i]==0){
                l=i;
                break;
            }
        }

        int[] checked = new int[l];
        int n =a[0];
        int vi=0;

        for(int i=0 ;i<=l;i++){
            boolean b=false;
            for(int j=0;j<l;j++){
                if(n!=checked[j]) b = true;
                else{
                    b=false;
                    break;
                }
            }
            if(b) {
                int count = 0;
                for (int j = i; j <= l; j++) {
                    if (a[j] == n) {
                        count++;
                    }
                }
                checked[vi] = n;
                vi++;
                if(n!=0) {
                    if (count == 1)
                        System.out.println(n + " occurs " + count + " time.");
                    else
                        System.out.println(n + " occurs " + count + " times.");
                }
            }
            n=a[i+1];
        }
    }
}
