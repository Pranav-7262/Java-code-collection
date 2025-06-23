package Hashing;

import java.util.HashMap;

public class FirstUniqueChar2 {
    public static void main(String[] args) {
        String s ="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
        HashMap<Character,Integer>hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
        }

    }
