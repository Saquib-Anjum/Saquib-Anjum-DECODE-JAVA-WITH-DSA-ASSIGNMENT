package src.Method_Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        /*
        Q4. Write a method to count the number
        of digits in a number
        and then print the square of this number.

         */
        digits_in_number calc = new digits_in_number();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number  ");
        int a= scan.nextInt();
        calc.count1(a);

    }
}
class digits_in_number{

    void count1(int n){
        int count=0;
        int sum;
        while(n!=0){
            n= n/10;
            count++;
        }
        System.out.println("number of digits in given number  ");
        System.out.println(count);
        System.out.println("square of this number is  "+(count*count));

    }
}
