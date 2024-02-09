package src.TwoDimensionalArrayandArrayList;

public class Q5 {
    public static void main(String[] args) {
        //Q5. Write a program to print
        // the row number having the
        // maximum sum in a given matrix.
        int[][] arr={{1 ,3, 5 ,7}, {3 ,4 ,7 ,8}, {1, 4 ,12, 3}};
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        int  maxsumrow=Integer.MIN_VALUE;
        int rowno=0;
        for (int i = 0; i <n; i++) {
            int rowsum=0;

            for (int j = 0; j < m; j++) {
                rowsum+=arr[i][j];
            }
            if(rowsum>maxsumrow)
            {maxsumrow=rowsum;
            rowno+=i;}
        }
        System.out.println();
        System.out.println("maximum sum is  "+maxsumrow+" and row number is "+rowno);
    }
}
