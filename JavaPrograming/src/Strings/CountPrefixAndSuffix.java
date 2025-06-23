package Strings;

import java.util.Arrays;

public class CountPrefixAndSuffix {
    public static void main(String[] args) {
    String []words = {"a","aba","ababa","aa"};
        System.out.println(Arrays.toString(new int[]{countPrefixSuffixPairs(words)}));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (isPrefixAndSuffix((words[i]), (words[j])))  {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean isPrefixAndSuffix(String s1, String s2) {
        if (s2.startsWith(s1) && s2.endsWith(s1)){
            return true;
        }
        return false;
    }
}

