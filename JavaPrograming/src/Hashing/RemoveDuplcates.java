package Hashing;

import java.util.HashSet;

public class RemoveDuplcates {
    public static void main(String[] args) {
      String s = "zvvo";
        System.out.println(removeDups(s));
    }
    public static String removeDups(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (set.add(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
