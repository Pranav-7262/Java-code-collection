package Recursion;

public class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("abcpranav", "pra"));
    }
    public static int strCount(String str, String sub) {
        if(str.isEmpty()) {
            return 0;
        }
        if(str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()) , sub);
        }
        return strCount(str.substring(1) , sub);
    }

}
