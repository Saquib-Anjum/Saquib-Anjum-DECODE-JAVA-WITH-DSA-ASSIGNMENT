package src.BasicSorting;

public class Q10 {
    public static void main(String[] args) {
        //Q10. Given an array of strings arr[] with
        // all strings in lowercase. Sort given strings
        // using Bubble Sort and
        //display the sorted array.



        //char[] ch={'d','t','y','d'};
        char[] ch={'d','c','b','a'};
        int n=ch.length;
        System.out.println("Array is     ");
        for (int i = 0; i <n ; i++) {
            System.out.print(ch[i]+"  ");

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(ch[j]>ch[j+1]){
                    char  temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;

                }

            }

        }
        System.out.println();
        System.out.println("sorted array  ");
        for (int i = 0; i <n ; i++) {
            System.out.print(ch[i]+"  ");

        }
    }
}
