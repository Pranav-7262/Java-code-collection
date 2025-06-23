package Hashing;

import java.util.HashMap;

public class AreAnagrams {
    public static void main(String[] args) {
    String s1 = "allergy", s2 = "allergic";
        System.out.println(areAnagrams(s1,s2));
    }
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer>hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
            hm.put(s2.charAt(i),hm.getOrDefault(s2.charAt(i),0)-1);
        }
        for (char ch:hm.keySet()){
            if (hm.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}
