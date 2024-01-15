package Assignment_of_Condition;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Q4. Implement a Java function to determine if a
        given year is a leap year or not.
        Print "Leap Year" if true,

 otherwise print "Not a Leap Year.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the which you want to check  ");
        int a = scan.nextInt();
        if(a%4==0){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}
