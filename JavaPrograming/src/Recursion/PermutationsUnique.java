package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsUnique {
    public static void main(String[] args) {
     String s = "AAA";
        System.out.println(findPermutation(s));
    }
    public static ArrayList<String> findPermutation(String s) {
        return  generatePermutations(new ArrayList<>(), s , 0);
    }
    private static ArrayList<String> generatePermutations(ArrayList<String> list, String s, int index) {
        if (index == s.length()) {
            return list;
        }
        if (list.size() == 0) {
            list.add(String.valueOf(s.charAt(0)));
            return generatePermutations(list, s, 1);
        }
        char ch = s.charAt(index);
        ArrayList<String> res = new ArrayList<>();

        for (String str : list) {
            for (int i = 0; i <= str.length(); i++) {
                String perm = str.substring(0, i) + ch + str.substring(i);
                if (!res.contains(perm)) {
                    res.add(perm);
                }
            }
        }

        return generatePermutations(res, s, index + 1);
    }
}