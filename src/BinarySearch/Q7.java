package src.BinarySearch;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class Q7 {
    //Q7. Write a program to apply binary search
    // in array sorted in decreasing order.
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4,3,2,1};
        System.out.println("Array is ");
        for(int ele:arr){
            System.out.print(ele+" ");

        }
        int res=-1;
        int t=2;
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==t){
                res=mid;
                break;
            }
            else if(arr[mid]<t) hi=mid-1;
            else lo=mid+1;
        }
        System.out.println();
        System.out.println("element is   "+res);

    }


}
