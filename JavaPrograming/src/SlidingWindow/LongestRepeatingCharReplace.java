package SlidingWindow;

import java.util.*;

public class LongestRepeatingCharReplace {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
    static int characterReplacement(String s, int k) {
        // code here
        int start=0;
        int end=0;
        int maxAns=0;
        int maxFreq=0;
        Map<Character,Integer> map = new HashMap<>();
        while(end<s.length()){
            map.put(s.charAt(end) , map.getOrDefault(s.charAt(end) ,0)+1);

            maxFreq=Math.max(maxFreq,map.get(s.charAt(end)));

            while((end-start+1)-maxFreq > k){
                map.put(s.charAt(start) , map.getOrDefault(s.charAt(start) ,0)-1);
                start++;
            }
            maxAns=Math.max(maxAns,end-start+1);
            end++;
        }
        return maxAns;
    }
}
