package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j||i+j==2*n)
                    System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
