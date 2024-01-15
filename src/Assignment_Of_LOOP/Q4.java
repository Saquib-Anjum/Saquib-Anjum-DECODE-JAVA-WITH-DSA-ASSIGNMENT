package Assignment_Of_LOOP;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*Q4. Write a Java program to check if a given string
        is a palindrome or not using a loop.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string     ");
        String str =sc.nextLine();
        int left=0;
        int right=str.length()-1;


        boolean isPld=true; //palindrome
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPld=false;
                break;
            }
            left++;
            right--;

        }

        if(isPld){
            System.out.println(str+" is palindrome");

        }
        else{
            System.out.println(str+" is not  palindrome");
        }
    }

}
