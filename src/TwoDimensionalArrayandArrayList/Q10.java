package src.TwoDimensionalArrayandArrayList;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of row   ");
        int r=scan.nextInt();
        System.out.print("Enter the size of column   ");
        int c=scan.nextInt();
        int[][] arr=new int[r][c];
        //taking input as array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the row  "+i+" and column "+j+" ");
                arr[i][j]=scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Array is  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println();
        int[][] brr=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
              brr[i][j]=arr[j][i];

            }

        }
        //
        System.out.println("wave");
        for (int i = 0; i <r ; i++) {
            if(i%2==0){
            for (int j = r-1; j >=0 ; j--) {

                    System.out.print(brr[i][j]+"  ");
                }
            }
            else{
                for (int j = 0; j < c; j++) {
                    System.out.print(brr[i][j]+"  ");

                }
            }
        }
    }
}
