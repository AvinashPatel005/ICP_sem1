package La5;

public class q2 {
    public static void main(String[] args) {
        int n=31;
        int rev=0;
        int c1=0,c2=0;
        for(int t=n;t>0;t/=10){
            rev = (rev*10)+t%10;
        }
        for(int i=2;i<=Math.max(n,rev);i++){
            if(n%i==0) c1++;
            if(rev%i==0) c2++;
        }
        if(c1==1&&c2==1) System.out.println("Twisted Prime");
        else System.out.println("No");
    }
}
