package src.Array_and_ArrayList;

public class Q12 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,3,2,1};
        int n=arr.length;
        int m=n/2;
        System.out.println("Array is  ");
        //array printing
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        boolean flag =false;
        int i =0;
        int j =n-1;
        while(i<j){
            if(arr[i]==arr[j]){
                flag=true;
            }
            else{
                flag=false;
            }
            i++;
            j--;
        }
        System.out.println();
        if(flag==true) System.out.println("It is palindrome");
        else System.out.println("not palindrome  ");
    }
}
