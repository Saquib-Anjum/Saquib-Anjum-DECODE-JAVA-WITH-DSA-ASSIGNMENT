package Assignment_of_Condition;

import java.util.Scanner;

public class Q5 {

    /*Q5. Write a Java program to find and print
    the greatest of three numbers entered by the use
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number   ");
        int a = sc.nextInt();
        System.out.print("Enter your first number   ");
        int b = sc.nextInt();
        System.out.print("Enter your first number   ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println(c+"  is greatest");
            }

        }
        else{
            if(b>c){
                System.out.println(b+"  is greatest");
            }
            else{
                System.out.println(c+"  is greatest");
            }
        }



    }
}
