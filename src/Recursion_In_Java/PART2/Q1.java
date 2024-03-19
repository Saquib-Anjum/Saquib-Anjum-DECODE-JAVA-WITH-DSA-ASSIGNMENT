package src.Recursion_In_Java.PART2;

public class Q1 {
    public static void main(String[] args) {
        //Q1. Print all the elements of an array in reverse order
        int[] arr={7,5,3,4,2,3,4,5,67,8,8,9,};
        int n=arr.length-1;
        print(arr,n);
    }
    public static void print(int[] arr,int n){

        if(n==0){

            return;
        }
        System.out.print(arr[n]+"  ");
        print(arr,n-1);

    }
}
