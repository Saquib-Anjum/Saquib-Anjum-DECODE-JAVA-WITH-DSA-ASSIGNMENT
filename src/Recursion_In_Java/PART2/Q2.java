package src.Recursion_In_Java.PART2;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        //Q2. Print index of a given element in an array. If not present, print -1
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number  ");
        int a=sc.nextInt();
        int[] arr ={1,2,3,4,5,65,7,8,9,4};
        int n=arr.length-1;
        print(arr,a,0);
    }
    public static void print(int[] arr,int a,int idx){
        if(idx==arr.length) return ;
        if(a==arr[idx]){
            System.out.println(idx);
        }
        else {
            print(arr,a,idx+1);
        }
    }


}
