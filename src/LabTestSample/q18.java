package LabTestSample;

public class q18 {
    public static void main(String[] args) {
        int current_number =2;
        int n=1;
        System.out.print(current_number+" ");
        while(n<=10){
            int next_term=(int)Math.pow((current_number - 1),2)- 1;
            System.out.print(next_term+" ");
            current_number=next_term;
            n++;

        }
    }
}
