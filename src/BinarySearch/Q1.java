package src.BinarySearch;

public class Q1 {
    public static void main(String[] args) {
        //Q1. Given a sorted array of n
        // elements and a target ‘x’.
        // Find the last occurrence of ‘x’ in the array. If ‘x’ does
        //not exist return -1.
        int [] arr={1,2,3,3,4,4,4,5};
        int target=4;
       int res= LastOccurrence(arr,target);
        System.out.println("last occurrence is   "+res);
    }
    public static int LastOccurrence(int arr[],int x){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int ans=7;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>x) {
                ans=Math.min(arr[mid],ans);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
     return ans;
    }
}
