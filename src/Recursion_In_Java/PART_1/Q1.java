package src.Recursion_In_Java.PART_1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        //1. Write a program to calculate the sum of odd numbers between a and b (both inclusive) using recursion.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the lower bound (a): ");
                int a = scanner.nextInt();

                System.out.print("Enter the upper bound (b): ");
                int b = scanner.nextInt();

                int result = sumOfOddNumbers(a, b);
                System.out.println("The sum of odd numbers between " + a + " and " + b + " is: " + result);

                scanner.close();
            }

            public static int sumOfOddNumbers(int a, int b) {
                if (a > b) {
                    return 0;
                } else if (a % 2 == 0) {
                    return sumOfOddNumbers(a + 1, b);
                } else {
                    return a + sumOfOddNumbers(a + 2, b);
                }
            }
        }

