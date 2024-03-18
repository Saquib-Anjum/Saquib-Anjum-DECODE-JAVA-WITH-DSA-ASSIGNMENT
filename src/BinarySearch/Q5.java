package src.BinarySearch;
import java.util.*;

public class Q5 {
    //Q5. Given a number ‘n’. Predict whether
    // ‘n’ is a valid perfect square or not
    //Input 1: n = 36
    //
    //Output 1: yes
    //
    //
    //Input 2: n = 45
    //
    //Output 2: no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number    ");
        int n=sc.nextInt();
        int lo=1;
        int hi=n;
        boolean flag = false;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid==n){
               flag=true;
               break;
            }
            else if(mid*mid>n) hi=mid-1;
            else lo=mid+1;
        }
        if (flag==true) System.out.println("YES");
        else System.out.println("NO");
    }
}
