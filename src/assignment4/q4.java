package assignment4;

public class q4 {
    public static void main(String[] args) {
        int n1 =56;
        int n2 =98;

        int x = Math.max(n1,n2);
        int y = Math.min(n1,n2);

        int r;

        while(x%y!=0){
            r=x%y;
            x=y;
            y=r;

        }
        System.out.println(y);
    }
}
