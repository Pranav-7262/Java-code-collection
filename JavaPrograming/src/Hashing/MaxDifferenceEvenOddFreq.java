package Hashing;

import java.util.HashMap;

public class MaxDifferenceEvenOddFreq {
    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(maxDifference(s));
    }
    public static int maxDifference(String s) {

        int a1=Integer.MIN_VALUE;
        int a2=Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch :s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char key : map.keySet()) {
            int val = map.get(key);
            if (val %2 == 0 && val < a2) {
               a2 = val;
            }
            if(val %2 != 0 && val > a1){
               a1 = val;

            }
        }
        return a1-a2;

    }
}
