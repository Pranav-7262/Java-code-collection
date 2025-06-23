package Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
     String s ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
       int first_pointer =0;
       int second_pointer=0;
       int max_length = 0;
        List<Character> list = new ArrayList<Character>();
        while (second_pointer<s.length()){
            if (!list.contains(s.charAt(second_pointer))){
                list.add(s.charAt(second_pointer));
                second_pointer++;
                max_length = Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(first_pointer)));
                first_pointer++;
            }
        }
        return max_length;
    }
}
