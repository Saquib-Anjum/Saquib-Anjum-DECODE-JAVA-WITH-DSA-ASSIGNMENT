package src.BasicSorting;

public class Q13 {
    public static void main(String[] args) {
        //Given an integer array and an integer
        // k where k<=size of array, We need to return
        // the kth smallest
        //element of the array.
        int[] arr={9,8,6,5,9,1,5,4,9};
        int n=arr.length;
        System.out.println("Array is   ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int min=Integer.MAX_VALUE;


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-1 ; j++) {
              if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
                min=arr[0];
            }

        }
        System.out.println();
        System.out.println("sorted array   ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("minimum is  "+min);
    }
}
