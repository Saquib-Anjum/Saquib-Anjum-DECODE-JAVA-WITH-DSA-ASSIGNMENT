package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();


//upper bridge
        for (int i = 1; i <= n - 1; i++) {
//  star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
//space


            for (int j = 1; j <= (2 * n) - (2 * i + 1); j++) {
                System.out.print(" " + " ");


            }

//            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }


            System.out.println();
        }
        //two straight line of stars
        for (int j = 1; j <= 2 * n - 1; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();


        for (int j = 1; j <= 2 * n - 1; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        //lower bridge
        // System.out.println();


        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            //for the spaces

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            //for the simple number triangle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*" + " ");

            }

            System.out.println();
        }
    }
}
