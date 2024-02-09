package src.TwoDimensionalArrayandArrayList;

public class Q2 {
    public static void main(String[] args) {
        //Q2. Write a program
        // to add two matrices and save the result
        // in one of the given matrices.
int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
int[][] brr={{4,5,8},{0,0,8},{1,2,0}};

int n=arr.length;
int m= arr[0].length;//column
        int[][] res= new int[n][m];

        System.out.println("1st Array is   ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("2nd Array is");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(brr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("result is ");

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j]=arr[i][j]+brr[i][j];
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }

    }
}
