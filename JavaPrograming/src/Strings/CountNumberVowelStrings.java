package Strings;

public class CountNumberVowelStrings {
    public static void main(String[] args) {
    String [] arr = {"are","amy","u"};
    int  left = 0, right = 2;
        System.out.println(vowelStrings(arr,left,right));
    }
    public static int vowelStrings(String[] words, int left, int right) {

        int count = 0;
        for (int i = left; i <= right ; i++) {
            String word = words[i];

            if (canVowel(word.charAt(0)) && canVowel(word.charAt(word.length()-1))) {
                count += 1;
            }
        }
        return count;
    }

    private static boolean canVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
