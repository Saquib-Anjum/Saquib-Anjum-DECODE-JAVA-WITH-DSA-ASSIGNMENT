package src.Recursion_In_Java.PART2;

import java.util.Scanner;

public class Q5 {
    public static int reversed;
    public static void main(String[] args) {
        //Q5. Write a recursive function to reverse a number.
        // Avoid preceding 0s in the reversed number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number   ");
        int n=sc.nextInt();
        printReverse(n);

    }
    public static void printReverse(int n){

        if(n<=10)
            System.out.print(n);
        else{
            System.out.print(n%10);
            printReverse(n/10);
        }

    }
}
