package src.Array_and_ArrayList;

public class Q10 {
    public static void main(String[] args) {

        //Q10. Given an array of integers, change the value
        // of all odd indexed elements to its second multiple and

        //increment all even indexed values by 10

        int[] arr = {34,54,67,97,34,23,54,67,87,45,34,23,32,12,33};
        int n= arr.length;
        System.out.println("Array is  ");
        int oddSum=0;
        int evenSum=0;

        // array printing
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        for (int i = 0; i <n ; i++) {
            if(arr[i]%2==0){
               arr[i]=arr[i]*2;

            }
            else{
                arr[i]=arr[i]+10;
            }


        }
        System.out.println();
        System.out.println(" now array is  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
