package Strings;

import java.util.*;

public class ArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
       String [] arr = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(arr));
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        for(String word : words) {
            if(!ans.isEmpty() && areAnagrams(ans.get(ans.size()-1) , word)) {
                continue;
            }
            else{
                ans.add(word);
            }

        }
        return ans;

    }
    private static boolean areAnagrams(String s1 , String s2) {
        if (s1.length() != s2.length()) return false;

        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
