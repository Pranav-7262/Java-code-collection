package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String str = "ABCCAA";
        System.out.println(longestRepeatingSubstring(str,2));
    }
    public static int longestRepeatingSubstring(String str, int k) {

        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0 , maxFreq = 0 ,maxLen = 0;

        for(int end=0;end<n;end++) {
            char ch=str.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq , map.get(ch));

            while((end-start+1) - maxFreq > k) {
                char left=str.charAt(start);
                map.put(left,map.get(left)-1);
                start++;
            }
            maxLen = Math.max(maxLen , end-start+1);
        }
        return maxLen;

    }
}
