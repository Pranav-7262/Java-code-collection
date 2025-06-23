package Hashing;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
   String s="egg";
   String t="add";
   System.out.println(isIsomorphic(s,t));

    }

    static boolean isIsomorphic(String s, String t) {


        HashMap<Character, Character> hm = new HashMap<>();

        // Loop through both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If charS has been mapped before, check if the mapping is correct
            if (hm.containsKey(charS)) {
                if (!hm.get(charS).equals(charT)) {
                    return false;  // Mismatch in mapping
                }
            } else {

                if (hm.containsValue(charT)) {//if t is already mapped with s returns false
                    return false;
                }


                hm.put(charS, charT);
            }
        }


        return true;
    }
}



