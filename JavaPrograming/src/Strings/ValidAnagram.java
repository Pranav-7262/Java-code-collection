package Strings;

public class ValidAnagram {
    public static void main(String[] args) {
      String s = "pranav";
      String t = "vapn";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] char_cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_cnt[s.charAt(i) - 'a']++;
            char_cnt[t.charAt(i) - 'a']--;
        }
        for (int cnt:char_cnt) {
            if (cnt!=0){
                return false;
            }
        }
        return true;
    }
}
