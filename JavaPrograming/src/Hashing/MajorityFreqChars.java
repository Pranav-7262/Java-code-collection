package Hashing;

import java.util.*;

public class MajorityFreqChars {
    public static void main(String[] args) {
        String s = "aaabbbccdddde";
        System.out.println(majorityFrequencyGroup(s)); // Output: "ab"
    }

    public static String majorityFrequencyGroup(String s) {

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        Map<Integer, List<Character>> freqGroup = new HashMap<>();
        for (char ch : freq.keySet()) {
            int f = freq.get(ch);
            freqGroup.putIfAbsent(f, new ArrayList<>());
            freqGroup.get(f).add(ch);
        }
        int maxSize = 0;
        int bestFreq = 0;
        List<Character> majority = new ArrayList<>();

        for (int f : freqGroup.keySet()) {
            List<Character> chars = freqGroup.get(f);
            if (chars.size() > maxSize || (chars.size() == maxSize && f > bestFreq)) {
                maxSize = chars.size();
                bestFreq = f;
                majority = chars;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : majority) sb.append(c);

        return sb.toString();
    }
}
