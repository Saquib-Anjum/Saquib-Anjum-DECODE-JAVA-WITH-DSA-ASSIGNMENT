package src.Method_Assignment;

public class Q3 {
    public static void main(String[] args) {


        /*Q3. Given two numbers a and b, write a
        method to print all odd numbers between them.


         */

                odd od = new odd();
                od.oddNumber(10,20);
    }
}

class odd{
    int num;
    void oddNumber(int a,int b){
        System.out.println("all odd numbers between  "+a+"  and  "+b);
        for (int i = a; i<b ; i++) {


            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
