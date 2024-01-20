package src.Method_Assignment;

public class Q2 {
    public static void main(String[] args) {

        /*Q2. Write a method that takes the
        radius of a circle as an argument and
        returns its area.

         */
        circle calc =new circle();
        calc.area_of_circle(6);

    }
}
class circle{
    double pi;
    double arr;
    void area_of_circle(int r){
        pi=3.14;
        System.out.println("Area of circle is  ");
        arr=pi*r*r;
        System.out.println(arr);

    }
}