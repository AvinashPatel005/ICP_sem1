package HLA6;

public class q3 {
    public static char mid(String s){
        int l = s.length();
        int mid = (l/2);
        return s.charAt(mid);
    }
    public static void main(String[] args) {
        System.out.println(mid("java"));
    }
}
