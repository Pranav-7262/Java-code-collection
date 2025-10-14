package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestBalancedSubstring {
    public static void main(String[] args) {
        String str = "aabcc";
        System.out.println(longestBalanced(str));
    }
    public static int longestBalanced(String s) {
        int maxlen = -1;
        for(int i=0;i<s.length();i++) {
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++) {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j) ,0) +1);

                if(isBalanced(map)) {
                    maxlen = Math.max(maxlen , j-i+1);
                }
            }
        }
        return maxlen;
    }
    private static boolean isBalanced(Map<Character,Integer> map) {
        int count = -1;
        for(int val : map.values()) {
            if(count == -1) {
                count = val;
            } else if(count != val) {
                return false;
            }
        }
        return true;
    }
}
