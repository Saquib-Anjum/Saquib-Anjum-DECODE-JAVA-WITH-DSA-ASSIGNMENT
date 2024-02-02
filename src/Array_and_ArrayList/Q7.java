package src.Array_and_ArrayList;

public class Q7 {
    public static void main(String[] args) {

       // Q7. WAP to find the largest three elements in the array.

        int[] arr = {23,34,54,69,67,56,38,39,23,11,23,54};
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max) max=arr[i];

            if(arr[i]!=max){
                if(arr[i]>=second_max) second_max=arr[i];
            }
            if(arr[i]!=max && arr[i]!=second_max){
                if(arr[i]>=third_max) third_max=arr[i];

            }

        }
        System.out.println();
        System.out.println("maximun "+ max);
        System.out.println(" second maximun "+ second_max);
        System.out.println(" third maximun "+ third_max);


    }
}
