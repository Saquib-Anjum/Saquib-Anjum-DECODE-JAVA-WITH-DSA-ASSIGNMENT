package src.Array_and_ArrayList;

public class Q3 {
    public static void main(String[] args) {
        //. Find the minimum value out of all elements in the array.

        int[] arr ={32,41,34,56,11,45,67,87,54,23,20,20,10};
        int n = arr.length;

        System.out.println("Array is  ");
        for(int ele:arr){
            System.out.print(ele+" ");

        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<min )  min =arr[i];

        }
        System.out.println();
        System.out.println("Minimum Value of this Array  ");
        System.out.println(min);
    }
}
