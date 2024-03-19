package src.Recursion_In_Java.PART2;

public class Q4 {
    public static void main(String[] args) {

        //Q4. Given an array of integers, print a sum triangle using recursion from
        // it such that the first level has all
        //array elements. After that, at each level the number of elements is one
        // less than the previous level and
        //elements at the level will be the sum of consecutive two elements in the
        // previous level.So, if sample input is [5, 4, 3, 2, 1], sample output will
        //be:
        //[5, 4, 3, 2, 1]
        //[9, 7, 5, 3]
        //[16, 12, 8]
        //[28, 20]
        //[48

                int[] arr = {5, 4, 3, 2, 1};
                printSumTriangle(arr, arr.length);
            }

            public static void printSumTriangle(int[] arr, int n) {
                if (n == 0) {
                    return;
                }

                // Print the current level of the sum triangle
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                // Calculate the next level of the sum triangle
                int[] nextLevel = new int[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    nextLevel[i] = arr[i] + arr[i + 1];
                }

                // Recursively print the next level of the sum triangle
                printSumTriangle(nextLevel, n - 1);
            }
        }



