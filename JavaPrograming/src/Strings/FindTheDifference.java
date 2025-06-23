package Strings;

public class FindTheDifference {
    public static void main(String[] args) {
    String s = "abcde";
    String t = "abcdef";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        int m=s.length();
        int n=t.length();
        int total = 0;;
        for (int i = 0; i <n ; i++) {
            total = total+t.charAt(i);
        }
        for (int i = 0; i < m; i++) {
            total = total - s.charAt(i);
        }
        return (char)total;
    }
}
