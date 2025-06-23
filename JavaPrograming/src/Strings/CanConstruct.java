package Strings;

public class CanConstruct {
    public static void main(String[] args) {
    String s = "annabelle";
    int k = 2;
        System.out.println(canConstruct(s,k));
    }
    public static boolean canConstruct(String s, int k) {
        if (s.length() < k){
            return false;
        }
        int []count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        int odd=0;
        for(int num:count){
            if ((num&1)==1){
                odd++;
            }

        }
        if (odd>k){
            return false;
        }
        else{
            return true;
        }
    }
}
