package Assignment_of_Condition;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        /*
        Q3. Design a Java program that calculates and prints whether a
        transaction results in a profit, loss, or
         break-even based on the cost price and selling price
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cost price   ");
        float cp=scan.nextFloat();

        System.out.print("Enter selling price   ");
        float sp = scan.nextFloat();

        if(cp>sp){
            System.out.println((cp-sp)+"  is losss");

        }
        else if(cp<sp){
            System.out.println((sp-cp)+"  is profit");

        }
        else{
            System.out.println("no profit no loss");
        }

    }
}
