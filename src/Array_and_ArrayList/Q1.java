package src.Array_and_ArrayList;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array    ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //taking input of an array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter index  "+i+" ");
            arr[i]=sc.nextInt();


        }
        //printing array
        System.out.println();
        System.out.println("Array is ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int product =1;
        for (int i = 0; i < n; i++) {
            product*=arr[i];

        }
        System.out.println("Product is");
        System.out.println(product);
    }
}
