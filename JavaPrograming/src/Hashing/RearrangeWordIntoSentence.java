package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class RearrangeWordIntoSentence {
    public static void main(String[] args) {
    String text = "Leetcode is cool";
        System.out.println(arrangeWords(text));
    }
    public static String arrangeWords(String text) {
        text = text.toLowerCase();
        String [] words = text.split(" ");

        LinkedHashMap<Integer, List<String>> map = new LinkedHashMap<>();
        for (String word : words){
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }
            map.get(length).add(word);
        }
        List<Integer> sortedLengths = new ArrayList<>(map.keySet());
        Collections.sort(sortedLengths);

        StringBuilder sb = new StringBuilder();
        for (int len : sortedLengths) {
            for (String word : map.get(len)) {
                sb.append(word).append(" ");
            }
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.setLength(sb.length() - 1);
        return sb.toString();

    }
}
