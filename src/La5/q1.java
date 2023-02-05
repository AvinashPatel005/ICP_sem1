package La5;

public class q1 {
    public static void main(String[] args) {
        int n1=220,n2=230;
        int s1 =0,s2=0;
        for(int i = 1;i<=Math.max(n1,n2)/2;i++){
            if(n1%i==0) s1 += i;
            if(n2%i==0) s2 += i;
        }
        if(n1==s2 && n2==s1) System.out.println("Ammical");
        else System.out.println("no");
    }
}
