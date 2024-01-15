package Basics_Assignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");

        double r= sc.nextDouble();
        double pi = 3.14;
        double area=  pi*(r*r);
        System.out.println("Area is =>"+ area);

        System.out.println("simple interest");

        System.out.println("Enter the principle");
        double p=sc.nextDouble();
        System.out.println("Enter the rate of interest  ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time  ");
        double t = sc.nextDouble();
        double si = (p*rate*t)/100;
        System.out.println("simple intrest is" + si);




    }
}
