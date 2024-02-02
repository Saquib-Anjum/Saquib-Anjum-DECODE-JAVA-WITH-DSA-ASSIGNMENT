package src.Array_and_ArrayList;

public class Q15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int x= 22;//target
        int n=arr.length;
        System.out.println("Array is  ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        boolean flag=false;
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = i+2; k < n; k++) {
                    if(arr[i]!=arr[j]&& arr[j]!=arr[k]) {
                        if (arr[i] + arr[j] + arr[k] == x) {
                            System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                            flag = true;
                        } else flag = false;

                    }

                }

            }

        }
        if(flag==true) System.out.println("it is present  ");
        else System.out.println("it is not present");


    }
}
