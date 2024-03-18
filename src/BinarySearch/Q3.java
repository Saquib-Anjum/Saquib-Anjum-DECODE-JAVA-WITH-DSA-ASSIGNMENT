package src.BinarySearch;

public class Q3 {
    public static void main(String[] args) {
        //Q3. Given a matrix having 0-1 only where each row
        // is sorted in increasing order,
        // find the row with the
        //maximum number of 1’s
        int[][] matrix = {
                        {0, 0, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 0}
                };

                int result = rowWithMaxOnes(matrix);
                System.out.println("Output: " + result);
            }
    // Function to find the row index with the maximum number of ones
    public static int rowWithMaxOnes(int[][] matrix) {
        int maxOnesRowIndex = -1;
        int maxOnesCount = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;
            int onesCount = 0;

            // Binary search for the leftmost occurrence of 1 in the row
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == 1) {
                    onesCount = cols - mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Update maxOnesRowIndex if current row has more ones
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }

        return maxOnesRowIndex;
    }
        }



