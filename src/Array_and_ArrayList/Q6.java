package src.Array_and_ArrayList;

public class Q6 {
    public static void main(String[] args) {
        int[] arr={98,78,56,50,54,34,23,32,11,76,56,45,54};
        int n=arr.length;
        int target=50;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=target){
                count++;
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
        System.out.println("number of element greater than 50 is  "+count);
    }
}
