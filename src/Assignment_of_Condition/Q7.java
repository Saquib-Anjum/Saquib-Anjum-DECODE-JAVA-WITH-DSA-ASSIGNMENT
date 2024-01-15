package Assignment_of_Condition;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number   ");
        int a = sc.nextInt();
        System.out.print("Enter your first number   ");
        int b = sc.nextInt();
        System.out.print("Enter your first number   ");
        int c = sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println(a+" is least");
            }
            else{
                System.out.println(c+"  is least");
            }

        }
        else{
            if(b<c){
                System.out.println(b+"  is least");
            }
            else{
                System.out.println(c+"  is least");
            }
        }
    }
}
