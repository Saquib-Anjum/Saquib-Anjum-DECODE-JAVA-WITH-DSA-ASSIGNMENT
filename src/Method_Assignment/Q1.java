package src.Method_Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*Q1. Write a method to print squares of the first n
        natural numbers, taking n as an
        argument to the method.

         */
          square sq= new square();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scan.nextInt();
          sq.squares(a);
    }
}
class square{
    void squares(int x){
        System.out.println("All the square of the numbers");
        for (int i = 1; i <= x; i++) {
            System.out.println(i*i);
        }
    }
}