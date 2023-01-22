package assignment4;

public class q3 {
    public static void main(String[] args) {
        int n = 10;
        int i =0;
        int sum=0;
        int t;
        while(i<=n){
            t=(int)((Math.random()*n)+1);
            sum=sum+t;
            i++;
        }
        System.out.println(sum/n);
    }
}
