package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
   String s = "abccbccba";
        System.out.println(remove(s));
    }
    static String remove(String s){
        if (s.length()<=1) return s;
        if (s.charAt(0) == s.charAt(1)){
            return remove(s.substring(1));
        }
        else {
        return s.charAt(0) + remove(s.substring(1));
    }
        }
}