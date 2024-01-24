package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();

        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j==n+1||i+j==n+(2*i-1)||j==n)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();

        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j==2*i+1||i+j==(2*n-1)||j==n)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }


    }
}
