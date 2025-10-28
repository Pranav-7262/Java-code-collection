package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(longestNiceSubstring(s));
    }
    public static String longestNiceSubstring(String s) {
        int n = s.length();
        String result = "";

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                String sub = s.substring(i , j);
                if (isNice(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }
    private static boolean isNice(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (!(set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c)))) {
                return false;
            }
        }
        return true;
    }
}
