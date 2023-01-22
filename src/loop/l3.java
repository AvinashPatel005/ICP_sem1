package loop;

public class l3 {
    public static void main(String[] args) {
        int n=5;
        String s = "";
        for (int i=1;i<=n;i++){
            s = s+i+s;
            System.out.println(s);
        }
    }
}
