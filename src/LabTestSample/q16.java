package LabTestSample;

public class q16 {
    public static void main(String[] args) {
        int n = 932935682;
        int count=0;
        for(int a =n;a>0;a=a/10){
            int r = a%10;
            if(r%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
