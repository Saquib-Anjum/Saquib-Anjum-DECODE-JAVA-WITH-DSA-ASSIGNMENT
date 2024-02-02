package src.Array_and_ArrayList;

public class Q16 {
    public static void main(String[] args) {
     fac(100);

    }
    static void fac(int n){
        int[] res = new int[500];
        res[0]=1;
        int res_size=1;
        for (int x = 2; x <=n ; x++)
            res_size=multiply(x,res,res_size);

           for (int j = res_size-1; j >=0 ; j--)
              System.out.print(res[j]);


        }
           static int multiply(int x,int res[],int res_size){
               int carry=0;
            for (int i = 0; i < res_size; i++) {
                int pro=res[i]*x+carry;
                res[i]=pro%10;
                carry= pro/10;

            }

           while(carry!=0){
               res[res_size]=carry%10;
               carry=carry/10;
               res_size++;
           }
           return res_size;
      }



    }

