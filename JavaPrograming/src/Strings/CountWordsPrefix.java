package Strings;

public class CountWordsPrefix {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "p";
        System.out.println(prefixCount(words, pref));
    }

    static int prefixCount(String[] words, String pref) {
        int n = words.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(pref)) {
                cnt++;
            }
        }
        return cnt;
    }
}