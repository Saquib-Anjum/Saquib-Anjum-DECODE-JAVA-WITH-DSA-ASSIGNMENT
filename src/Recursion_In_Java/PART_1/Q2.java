package src.Recursion_In_Java.PART_1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stair     ");
        int n=sc.nextInt();
        int res = countWay(n);
        System.out.println("Number of the ways     "+res);
    }
    public static int countWay(int n){
        if(n<=3){
            return n;
        }
        int ways=countWay(n-1)+countWay(n-2)+countWay(n-3);
        return ways;
    }
}
