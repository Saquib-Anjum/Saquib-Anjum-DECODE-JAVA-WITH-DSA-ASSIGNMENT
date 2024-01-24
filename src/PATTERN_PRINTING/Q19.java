package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j==n+1||i+j==n+(2*i-1))
                    System.out.print(i+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

    }
}
