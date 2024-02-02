package src.Array_and_ArrayList;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,76,3,4,2,3,4,8,7,6,9,8,7,6,9,11,45,11,45,};
        int n =arr.length;
        System.out.println("Array is  ");

        //printing array;
        int unq=0;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
boolean a=true;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                a=false;
                }
                else{
                   a=true;
                   unq=arr[j];

                }
            }

        }
        System.out.println();
        if(a==false){
            System.out.println("unique is  " +unq);
        }
        else{
            System.out.println("no unique element present  ");
        }


    }
}
