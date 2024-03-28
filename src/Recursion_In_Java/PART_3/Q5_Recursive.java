package src.Recursion_In_Java.PART_3;

public class Q5_Recursive {
    public static void main(String[] args) {
        int decimalNumber = 42;
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is: " + binaryResult);
    }
    public static String decimalToBinary(int decimalNum) {
        if (decimalNum == 0) {
            return "0";  // Base case: decimal 0 corresponds to binary 0
        } else {
            // Recursive case: divide the number by 2 and append the remainder
            return decimalToBinary(decimalNum / 2) + (decimalNum % 2);
        }
    }
}
