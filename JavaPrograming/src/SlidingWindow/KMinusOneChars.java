package SlidingWindow;

import java.util.HashMap;

public class KMinusOneChars {
    public static void main(String[] args) {
       String str = "abcc";
        System.out.println(substrCount(str,2));
    }

    public static int substrCount(String s, int k) {
        // code here
        int n = s.length();
        int start = 0;
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (end - start + 1 > k) {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                if (map.get(s.charAt(start)) == 0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }

            if (end - start + 1 == k) {
                if (map.size() == k - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
