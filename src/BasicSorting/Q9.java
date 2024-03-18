package src.BasicSorting;

public class Q9 {
    public static void main(String[] args) {
//        Q9. Given an array of digits (values are from 0 to 9),
//        the task is to find the minimum possible sum of two
//        numbers formed from digits of the array.
//        Please note that all digits of the
//        given array must be used to form
//        the two numbers.
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println("Array is   ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
int min=Integer.MAX_VALUE;
        int sum=0;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                 sum=arr[i]+arr[j];
               if(sum<min) min=sum;
                System.out.println(arr[i]+","+arr[j]+"     "+min+"  ");
            }

        }

    }
}
