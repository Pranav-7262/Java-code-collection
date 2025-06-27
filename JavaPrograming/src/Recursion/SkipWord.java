package Recursion;

public class SkipWord {
    public static void main(String[] args) {
//        System.out.println(skip("pranappleop"));
        System.out.println(skipapp("pranapplcop"));
    }
    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")){
            return skip(up.substring(5));
        }
        else {
            return ch+skip(up.substring(1));
        }
    }
    static String skipapp(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipapp(up.substring(3));
        }
        else {
            return up.charAt(0)+skipapp(up.substring(1));
        }
    }
}
