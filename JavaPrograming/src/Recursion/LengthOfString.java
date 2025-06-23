package Recursion;

public class LengthOfString {
    public static void main(String[] args) {
  String str = "abdnsk";
        System.out.println(length(str));

    }
    static int length(String str){
        if (str.equals("")){
            return 0;
        }
        else {
            return length(str.substring(1))+1;
        }
    }
}
