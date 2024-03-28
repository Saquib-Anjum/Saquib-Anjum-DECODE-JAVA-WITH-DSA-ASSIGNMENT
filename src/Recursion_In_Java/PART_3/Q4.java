package src.Recursion_In_Java.PART_3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //Q4. Program to find the factorial of a given number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1) return 1;
        int res=n*fact(n-1);
        return res;
    }
}
