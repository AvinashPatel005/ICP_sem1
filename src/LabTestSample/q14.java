package LabTestSample;

public class q14 {
    public static void main(String[] args) {
        int i=1;
        int j =1;
        while(i<=10){
            if(j%4==0||j%5==0){
                System.out.print(j+" ");
                i++;
            }
            j++;
        }
    }
}
