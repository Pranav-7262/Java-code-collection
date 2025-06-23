package Hashing;

import java.util.HashSet;

public class StringDuplicates {
    public static void main(String[] args) {
    String s = "geEksforGEeks";
        System.out.println(removeDuplicates(s));
    }
    public static  String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if (!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

