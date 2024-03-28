package src.Recursion_In_Java.PART_3;

public class Q3 {
    //Q3. Given a string, find the length of the longest common substring from two given strings.
    public static void main(String[] args) {
        String s="abcd";
        subString( 0,s,"");
    }
    public static void subString(int i ,String s,String res){
        if(i==s.length()){
            System.out.print(res+" ");
            return;
        }
        char ch=s.charAt(i);
        subString(i+1,s,res+ch);
        subString(i+1,s,res);
    }
}
