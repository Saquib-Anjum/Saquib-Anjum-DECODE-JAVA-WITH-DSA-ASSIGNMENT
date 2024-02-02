package src.Array_and_ArrayList;

public class Q9 {
    public static void main(String[] args) {

        //     Q9. Find the difference between the sum of elements
        //     at even indices to the sum of elements at odd indices.
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
                evenSum+=arr[i];

            }
            else{
                oddSum+=arr[i];
            }


        }
        System.out.println();
        System.out.println("even sum is  "+evenSum);
        System.out.println("odd sum is  "+oddSum);

    }
}
