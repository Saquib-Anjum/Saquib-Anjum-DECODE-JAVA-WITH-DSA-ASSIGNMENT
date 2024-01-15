package Assignment_of_Condition;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        /*
     Create a Java function that takes three integer parameters
     representing the sides of a triangle and

 prints whether it's equilateral, isosceles, or scalene.
     */



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first side   ");
        int a = sc.nextInt();
        System.out.print("Enter your second side   ");
        int b = sc.nextInt();
        System.out.print("Enter your third side   ");
        int c = sc.nextInt();

        if(a==b &&  b==c && c==a){
            System.out.println("Equilateral triangle");
        }
        else if(a==b||b==c||c==a){
            System.out.println("isoscale triangle");
        }

        else{
            System.out.println("scalene triangle");
        }

    }

}
