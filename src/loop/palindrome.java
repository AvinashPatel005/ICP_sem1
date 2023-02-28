package loop;

public class palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int l = s.length();
        boolean f= true;
        for(int i=0 ; i<l;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)) f=false;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));
    }
}
