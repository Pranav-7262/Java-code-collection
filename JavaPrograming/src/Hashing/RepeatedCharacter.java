package Hashing;

import java.util.HashMap;

public class RepeatedCharacter {
    public static void main(String[] args) {
      String s = "geeksforgeeks";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                return s.charAt(i);
            }
            hm.put(s.charAt(i),1);
        }
        return ' ';
    }
}
