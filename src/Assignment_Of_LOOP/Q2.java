package Assignment_Of_LOOP;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*Q2. Write a Java program to print a multiplication table for a
        given number 'n'.*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number      ");
        int n = scan.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" * "+n+"   ="+i*n);

        }

}
}
