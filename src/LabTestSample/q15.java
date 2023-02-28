package LabTestSample;

public class q15 {
    public static void main(String[] args) {
        int dec = 10;
        int bin=0;
        int j =0;
        for(int i=dec;i>0;i=i/2){
            bin=bin+(int)Math.pow(10,j)*(i%2);
            j++;
        }
        System.out.println(bin);
    }
}
