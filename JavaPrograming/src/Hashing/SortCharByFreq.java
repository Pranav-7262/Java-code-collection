package Hashing;

import java.util.*;

public class SortCharByFreq {
    public static void main(String[] args) {
   String s = "pranav";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());//conversion of list to map
        list.sort((a, b) -> b.getValue() - a.getValue());//sorting list in descending order
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return sb.toString();
    }
}
