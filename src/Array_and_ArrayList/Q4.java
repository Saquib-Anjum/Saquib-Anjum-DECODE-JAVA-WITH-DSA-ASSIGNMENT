package src.Array_and_ArrayList;

public class Q4 {
    public static void main(String[] args) {
        //Q4. WAP to find the duplicate elements
        // from the given array of elements


        int[] arr ={7,7,8,7,6,5,5,3,4,9,8,2,1,24,5,8,6};
        int  n = arr.length;
        System.out.println("array is ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
//        int i=0;
//        int j=n-1;
//        while(i<j){
//            if(arr[i]==arr[j]){
//                System.out.println(arr[i]);
//                System.out.println(arr[j]);
//
//            }
//            i++;
//            j--;
//        }


        for (int i = 0; i <n ; i++) {
            for (int j=i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("index "+"("+i+" ,"+j+")");

                    System.out.println(arr[i]+" "+","+" "+arr[j]);
                }

            }

        }

    }
}
