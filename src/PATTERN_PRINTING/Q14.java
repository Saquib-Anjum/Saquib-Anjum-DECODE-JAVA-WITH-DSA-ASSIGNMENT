package src.PATTERN_PRINTING;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            int a=(64+i);
            for(int j=1;j<=i;j++){
                System.out.print((char)(a)+" ");
                a--;
            }
            int b=66;
            for (int j = 2; j <=i ; j++) {
                System.out.print((char)(b)+" ");
                b++;
            }
            System.out.println();
        }

    }
}
