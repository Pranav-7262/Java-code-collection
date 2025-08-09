package Recursion;

public class StringClean {
    public static void main(String[] args) {
        System.out.println(stringClean("pprannav"));
    }
    public static String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return stringClean(str.substring(1));

        }
        else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}
