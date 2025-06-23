package Hashing;

import java.util.HashSet;

public class LongestPalindrone {
    public static void main(String[] args) {
     String s =  "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        HashSet<Character>hs = new HashSet<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hs.contains(ch)){
                length = length+2;
                hs.remove(ch);
            }
            else {
                hs.add(ch);
            }

        }
        if (hs.size()>0) length++;
        return length;
    }
}
