package src.Assignment_Of_LOOP;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        /*  Q5. Write a Java program to generate
        and print the first 'n' terms of the Fibonacci series

         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(a  + " ");

            // Add the current term to the sum
            sum =sum+a;

            // Update the terms for the next iteration
            int c =a+ b;
            a = b;
            b =c;
                }

            System.out.println("\nSum of the Fibonacci series: " + sum);




    }

}
