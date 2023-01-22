package assignment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        double discount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Shopping price: ");
        double total = sc.nextDouble();

        if(total>5000){
            discount = 0.1*total;
        }
        else if(total>2000){
            discount = 0.05*total;
        }
        else{
            discount = 0.03*total;
        }

        System.out.println("Total Shopping Price: "+total);
        System.out.println("Discount: "+discount);
        System.out.println("Payable Amount: "+(total-discount));
    }
}
