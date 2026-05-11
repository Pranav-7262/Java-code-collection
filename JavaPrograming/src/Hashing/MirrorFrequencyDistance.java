package Hashing;

import java.util.*;

public class MirrorFrequencyDistance {
    public static void main(String[] args) {
     String  s = "ab1z9";
        System.out.println(mirrorFrequency(s));
    }
    public static int mirrorFrequency(String s) {

        int total=0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray() ) {
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))) continue;
            char opp;
            if(Character.isLetter(s.charAt(i))){
                opp = (char) ('a'+(25 -(s.charAt(i) - 'a')));
            }
            else {
                opp = (char) ('0'+(9 -(s.charAt(i) - '0')));
            }
            int f1 = map.get(s.charAt(i));
            int f2 = map.getOrDefault(opp,0);
            total += Math.abs(f1 - f2);
            set.add(s.charAt(i));
            set.add(opp);
        }
        return total;
    }
}
