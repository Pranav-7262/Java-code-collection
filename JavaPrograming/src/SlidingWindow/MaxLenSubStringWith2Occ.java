package SlidingWindow;

import java.util.HashMap;

public class MaxLenSubStringWith2Occ {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
    public static int maximumLengthSubstring(String s) {
        int n = s.length();
        int start = 0;
        int maxlen = 0;
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(s.charAt(i) ,map.getOrDefault(s.charAt(i) ,0)+1);

            while(map.get(s.charAt(i)) > 2) {
                map.put(s.charAt(start) ,map.getOrDefault(s.charAt(start) ,0)-1);
                if(map.get(s.charAt(start)) == 0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }
            maxlen = Math.max(maxlen , i-start+1);

        }
        return maxlen;
    }
}
