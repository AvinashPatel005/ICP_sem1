package HA4;

public class q1 {
    public static void main(String[] args) {
        int s1=0,s2=0;
        System.out.print("(");
        for(int i = 1;i<=10;i++){
            s1=s1+i;
            s2=s2+(i*i);
        }
        System.out.println("The sum of the squares of the first ten natural numbers is:");
        System.out.println("1^2+2^2+3^2+4^2+5^2+6^2+7^2+8^2+9^2+10^2 = "+s2);
        System.out.println("\nThe square of the sum of the first ten natural numbers is:");
        System.out.println("(1+2+3+4+5+6+7+8+9+10)^2 = "+s1*s1);
        System.out.println("\nHence the difference between the sum of the squares of the first\nten natural numbers and the square of the sum is "+s1*s1+"-"+s2+" = "+(s1*s1-s2));
    }
}
