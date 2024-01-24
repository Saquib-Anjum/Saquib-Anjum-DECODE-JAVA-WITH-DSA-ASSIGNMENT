package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows     ");
        int n = scan.nextInt();


        for(int j=1;j<=2*n-1;j++){
            System.out.print((char)(j+64)+" ");
        }
        System.out.println();
        n--;

        for(int i=1;i<=n;i++){//rows
            int a=65;

            for(int j=1 ; j<=n+1-i;j++) {//number
                System.out.print((char)(a++) +" ");
            }
            //for the spaces

            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            //for the simple number triangle
            for(int k=1;k<=n+1-i;k++){
                System.out.print((char)(a)+" ");
                a++;
            }

            System.out.println();
        }



        }
}













