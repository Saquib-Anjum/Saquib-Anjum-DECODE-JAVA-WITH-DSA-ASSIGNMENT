package Assignment_Of_LOOP;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*Q3.
        Write a Java program to
        find the GCD (Greatest Common Divisor) of two numbers
        using a loop.*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your  1st number      ");
        int n1 = scan.nextInt();

        System.out.print("Enter your  2nd number      ");

        int n2 = scan.nextInt();
        int gcd= 1;
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1 % i==0  &&  n2 % i==0){
                gcd=i;
            }
        }
        System.out.println("GCD OF "+n1+" and "+n2+" is   "+gcd);
    }

}
