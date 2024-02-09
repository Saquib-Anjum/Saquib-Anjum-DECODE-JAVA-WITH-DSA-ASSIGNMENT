package src.TwoDimensionalArrayandArrayList;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //. Write a program to find
        // the largest element of a given 2D array of integers.

//        int[][] arr={{1 ,3, 5 ,7}, {3 ,4 ,7 ,8}, {1, 4 ,12, 3}};
//        int n=arr.length;
//        int m=arr[0].length;
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
int max=Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <  c; j++) {
                max=Math.max(max,arr[i][j]);
            }

        }
        System.out.println();
        System.out.println("maximum is   "+max);
    }
}
