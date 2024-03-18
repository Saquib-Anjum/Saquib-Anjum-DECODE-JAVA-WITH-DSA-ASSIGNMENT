package src.BasicSorting;

public class Q4 {
    public static void main(String[] args) {
int[] arr={3,5,7,4,2,5,9,8};
int n=arr.length;
        System.out.println("Array is  ");
print(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println();
        System.out.println("sorted array in decreasing order  ");
print(arr);
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
    }

    public static void swap(int[] arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
