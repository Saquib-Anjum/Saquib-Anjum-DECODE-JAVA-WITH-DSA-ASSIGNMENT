package src.TwoDimensionalArrayandArrayList;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        //Write a program to
        // rotate the matrix by 90
        // degrees anti-clockwise.
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
        rotate90deg(r,c,arr);

    }
    public static void rotate90deg(int r,int c,int[][] arr){
        int [][] brr= new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
              brr[i][j]=arr[j][i];
            }
        }
        System.out.println();
        System.out.println("transpose is  ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(brr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("90 deg rotation   ");
        for (int i = 0; i < c; i++) {
            int a=0;
            int b=c-1;

            while(a<b){
                int temp=brr[a][i];
                brr[a][i]=brr[b][i];
                brr[b][i]=temp;
                a++;
                b--;
            }

        }
        System.out.println();

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(brr[i][j]+" ");

            }
            System.out.println();
        }

    }

}
