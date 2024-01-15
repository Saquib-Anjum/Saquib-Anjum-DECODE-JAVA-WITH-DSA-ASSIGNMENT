package Assignment_of_Condition;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(" this is assignment of condition chapter");
        /*
        Q1. Write a Java function that takes an integer as input
         and prints "Even" if the number is even
         and "Odd" if it's odd
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your number   ");
        int a  = scan.nextInt();
        if(a%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }


    }
}
