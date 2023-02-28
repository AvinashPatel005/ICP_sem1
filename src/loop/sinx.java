package loop;

import java.util.Scanner;

public class sinx {
    public static void main(String[] args) {
        double temp=1;
        double sin=0;
        int sign=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle in degree [0,90] :");
        double angle=sc.nextDouble()/180*Math.PI;
        for(int i =1;temp>0.000001;i+=2){
            int fact =1;
            for(int j =1;j<=i;j++){
                fact = j*fact;
            }
            temp=(Math.pow(angle,i)/fact);
            sin+=temp*sign;
            sign*=-1;
        }
        System.out.println(sin);
    }
}
