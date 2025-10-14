package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubStringsABC {
    public static void main(String[] args) {
  String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s) {

        Map<Character, Integer> charCounts = new HashMap<>();
        charCounts.put('a', 0);
        charCounts.put('b', 0);
        charCounts.put('c', 0);

        int left = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            charCounts.put(currentChar, charCounts.getOrDefault(currentChar, 0) + 1);

            while (charCounts.get('a') > 0 && charCounts.get('b') > 0 && charCounts.get('c') > 0) {
                res += s.length() - i;

                char charAtLeft = s.charAt(left);
                charCounts.put(charAtLeft, charCounts.get(charAtLeft) - 1);
                left++;
            }
        }
        return res;
    }
}
