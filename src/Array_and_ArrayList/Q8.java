package src.Array_and_ArrayList;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        //Q8. Check if the given array is sorted or not

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

        boolean flag =  true;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]<arr[j]){
                    flag =true;
                }
                else{
                   flag=false;
                }

            }

        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("not sorted");
    }
}
