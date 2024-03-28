package src.Recursion_In_Java.PART_3;
import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        //Q1. Given an integer array containing unique numbers,
        // return power set, containing all the subsets of the set.
        //[Leetcode] 78

        Solution s = new Solution();
        int[] arr={1,2,3};
        s.subsets(arr);
        System.out.println("Array is  ");
        print(arr);
        System.out.println();
        System.out.println("subset is  ");
        System.out.println(s.res);
        System.out.println("size ");
        System.out.println(s.res.size());

    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+"  ");
        }
    }
}
    class Solution {
        static List<List<Integer>> res;

        public List<List<Integer>> subsets(int[] arr) {
            res = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            answer(0, arr, subset);
            return res;
        }

        public void answer(int index, int[] arr, List<Integer> subset) {
            if (index == arr.length) {
                res.add(new ArrayList<>(subset)); // Add a copy of the current subset to the result
                return;
            }

            // Include current element
            subset.add(arr[index]);
            answer(index + 1, arr, subset);

            // Exclude current element
            subset.remove(subset.size() - 1);
            answer(index + 1, arr, subset);
        }
    }



