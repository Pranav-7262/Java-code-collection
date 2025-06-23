package Hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
   String []arr = {"listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"};
        System.out.println(groupAnagrams(arr));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for (String str : strs) {
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
