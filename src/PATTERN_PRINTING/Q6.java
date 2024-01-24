package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Scanner scan =new Scanner(System.in);
        //.out.print("Enter the number of rows  ");
        int n = 4;

        for(int i=1;i<=n;i++){
            if (i==1||i==4) {
                for (int j = 1; j <=5 ; j++) {
                    System.out.print("*"+" ");
                }

            }
            else
            {
                for (int j = 1; j <=2 ; j++) {
                    System.out.print("*"+" ");

                }
            }
            System.out.println();
        }
    }
}
