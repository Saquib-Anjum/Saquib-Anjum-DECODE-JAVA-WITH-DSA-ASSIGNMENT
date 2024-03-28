package src.Recursion_In_Java.PART_3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Q5. Program to convert a decimal number to binary
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number "  );
        int decimalNumber=sc.nextInt();


        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is: " + binaryResult);
    }
    public static String decimalToBinary(int decimalNum) {
        return Integer.toBinaryString(decimalNum);
    }
}
