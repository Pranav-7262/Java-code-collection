package SlidingWindow;

import java.util.*;

public class CountOccurencesOfAnagrams {
    public static void main(String[] args) {
       String txt = "forxxorfxdofr";
       String pat = "for";
        System.out.println(search(pat,txt));
    }
    static int search(String pat, String txt) {
        // code here
        int k = pat.length();
        int count=0;

        Map<Character,Integer> patmap = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(char ch : pat.toCharArray()) {
            patmap.put(ch,patmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<txt.length();i++) {
            char ch = txt.charAt(i);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if (i >= k) {
                char leftChar = txt.charAt(i - k);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
            }

            if(i >= k-1 && window.equals(patmap)) {
                count++;
            }
        }
        return count;
    }
}
