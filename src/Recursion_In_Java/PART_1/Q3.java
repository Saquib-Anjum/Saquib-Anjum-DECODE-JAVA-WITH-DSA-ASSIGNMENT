package src.Recursion_In_Java.PART_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        ///Q3. Given a positive integer, return true if it is a power of
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number   ");
        int n=sc.nextInt();

        System.out.println( check(n));
    }
    public static boolean   check(int n){
        if(n==1) return true;

       if(n%2!=0 ||n==0) return false;
       return check(n/2);
    }
}
