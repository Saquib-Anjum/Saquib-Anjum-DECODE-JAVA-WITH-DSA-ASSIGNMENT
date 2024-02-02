package src.Array_and_ArrayList;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        //Q17. Find the first non-repeating element in the array
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the size of an array  ");
        int n= sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of index  "+i+" ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Array is" );
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("Non repeated element is  ");
        int x=0;
        for (int i = 0; i < n; i++) {
            x=x ^arr[i];
        }
        System.out.println();
        System.out.println(x);
    }
}
