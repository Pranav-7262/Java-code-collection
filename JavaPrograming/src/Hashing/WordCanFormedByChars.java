package Hashing;

import java.util.HashMap;

public class WordCanFormedByChars {
    public static void main(String[] args) {
  String []word = {"cat","bt","hat","tree"};
  String chars = "atach";
        System.out.println(countCharacters(word,chars));
    }
    public static int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int total = 0;
        for (String word : words) {
            HashMap<Character,Integer> map2 = new HashMap<>();
            for (char c: word.toCharArray()) {
                map2.put(c, map2.getOrDefault(c,0)+1);
            }
            boolean isGood = true;
            for (char ch : map2.keySet()) {
                if (map2.get(ch) > map1.getOrDefault(ch,0)){
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                total += word.length();
            }
        }
        return total;
    }
}
