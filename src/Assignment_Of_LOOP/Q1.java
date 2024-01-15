package Assignment_Of_LOOP;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*Write a Java program to calculate the sum of natural numbers
        up to a given positive integer 'n'.*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number till you want print     ");
        int n = scan.nextInt();
        for(int i =0;i<=n;i++){
            System.out.println(i);
        }
    }
}
