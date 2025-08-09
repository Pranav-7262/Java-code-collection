package Recursion;

public class StrCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }
    public static boolean strCopies(String str, String sub, int n) {
        if(n== 0){
            return true;
        }
        if(sub.length() > str.length()){
            return false;
        }
        if(str.startsWith(sub)) {
            return strCopies(str.substring(1),sub ,n-1);
        } else{
            return strCopies(str.substring(1),sub ,n);
        }
    }

}
