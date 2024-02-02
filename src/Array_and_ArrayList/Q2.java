package src.Array_and_ArrayList;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

       /*Q2. Find the second-largest
        // element in the given Array in one pass.*/

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


        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) max=arr[i];

            if(arr[i]!=max){
               if(arr[i]>=secmax){
                   secmax=arr[i];
               }

               }


        }



        System.out.println();
        System.out.println("second largest  ");
        System.out.println(secmax);
        System.out.println("max");
        System.out.println(max);
    }
}
