package HLA6;

public class q4 {
    public static int count(String s){
        int count=1;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("  s    public  ssda ds s    static  void main"));
    }
}
