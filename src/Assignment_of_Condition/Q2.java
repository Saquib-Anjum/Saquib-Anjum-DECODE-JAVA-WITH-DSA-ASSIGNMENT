package Assignment_of_Condition;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
                /*     Q2. Create a Java method to find and print
                the absolute value of an integer
                without using the built-in Math.abs() function
                 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number     ");
        int a = scan.nextInt();
        if(a<0){

            System.out.println(-1*a);

            }
            else{
            System.out.println(a);
        }

    }
}
