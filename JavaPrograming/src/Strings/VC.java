package Strings;

public class VC {
    public static void main(String[] args) {
        String s = "pranav";
        System.out.println(vowelConsonantScore(s));
    }
    public static int vowelConsonantScore(String s) {
        if(s == null || s.isEmpty()) return 0;
        int vowel = 0;
        int c = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) {
                if(isValid(ch)) {
                    vowel++;
                } else{
                    c++;
                }
            }
        }
        if(c == 0) return 0;
        return vowel/c;
    }
    private static boolean isValid(Character ch) {
       ch= Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'o'|| ch == 'u' || ch == 'i');
    }
}
