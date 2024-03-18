package src.BinarySearch;

public class Q9 {
    public static void main(String[] args) {
        //Q9. You are given an m x n integer matrix  with the following two properties:
        // *->Each row is sorted in non-decreasing order.
        //* ->The first integer of each row is greater than the last integer of the previous row
        //Given an integer target , return true if target is in matrix or false otherwise.
        //
        //You must write a solution in O(log(m * n)) time complexity
        //Example 1:
        //
        //Example 2:
        int [][] arr={{1,2,3,6}, {11,55,56,87} ,{12,43,24,25,},{90,89,78,67}};
        int target =100;
        int res=-1;
        System.out.println("Array is  ");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        int n=arr.length;
        int m=arr[0].length;
        int lo=0;
        int hi=(n*m)-1;
        boolean flag=false;
        while(lo<hi){
            int mid=(lo+hi)/2;
            int i=mid/m;//finding the exact row index of 2d array
            int j=mid%m;//finding the exact column index of 2d array

            if(arr[i][j]==target) {
                flag=true;
                break;
            }
            else if(arr[i][j]>target) hi=mid-1;
            else lo=mid+1;
        }
        System.out.println();
       if(flag==true) System.out.println("YES");
       else System.out.println("NO");
    }
}
