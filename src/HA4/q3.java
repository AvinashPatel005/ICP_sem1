package HA4;

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter a series:");
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
        for(int i=0;i<l;i++){                    //sorting
            for(int j=0;j<l-1;j++){
                int temp =0;
                if(a[j+1]<a[j]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int k=0;
        for(int i=0;i<l;){
            int count=1;
           for(int j=i;j<l;j++){
               if(a[j]==a[j+1]) count++;
               else{
                   i=j+1;
                   break;
               }
           }
           if (count == 1) System.out.println(a[i-1] + " occurs " + count + " time.");
           else System.out.println(a[i-1] + " occurs " + count + " times.");
        }
    }
}
