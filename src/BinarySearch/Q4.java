package src.BinarySearch;

public class Q4 {
    //Q4. Given an array of integers nums containing n + 1
    // integers where each integer is in the range [1, n]
    //inclusive in sorted order.There is only one repeated number
    // in nums, return this repeated number.

    //input 1: arr[] = {1,2,3,3,4}
    //
    //Output 1: 3
    //
    //Input 2: arr[] = {1,2,2,3,4,5}
    //
    //Output 2: 2
    public static void main(String[] args) {
        int[] arr={ 1,2,3,3,4};
        System.out.println("Array is  ");
        print(arr);
        int res=findNumber(arr);
        System.out.println("the  repeated number is  "+res);
    }
    public static int findNumber(int[] arr){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo=(hi-lo)/2;
            if(arr[mid]==arr[mid-1]||arr[mid]==arr[mid+1]) return arr[mid];
            else if(arr[mid]!=arr[mid-1])  lo=mid+1;
            else hi=mid-1;

        }
        return 1;
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
