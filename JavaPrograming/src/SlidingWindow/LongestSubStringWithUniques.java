package SlidingWindow;

import java.util.HashSet;

public class LongestSubStringWithUniques {
    public static void main(String[] args) {
        String s = "absauidkolmqwb";
        System.out.println(uniqueSubstring(s));

    }
    public static int uniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int res = 0;

        for (int end = 0; end < s.length(); end++) {

            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            res = Math.max(res, set.size());
        }
        return res;
    }
}
