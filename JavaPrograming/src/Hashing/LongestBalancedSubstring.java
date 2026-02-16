package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestBalancedSubstring {
    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(longestBalanced(s));
    }
    public static int longestBalanced(String s) {
        int maxlen = -1;
        int n = s.length();
        for(int i=0;i<n;i++) {
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++) {
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
