package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}