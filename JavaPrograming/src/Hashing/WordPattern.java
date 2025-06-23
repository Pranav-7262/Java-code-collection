import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

    static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");  // Split the string into words
        if (pattern.length() != words.length) {
            return false;  // If the number of words and pattern length don't match, return false
        }

        HashMap<Character, String> hm = new HashMap<>();  // Map pattern char to word
        for (int i = 0; i < pattern.length(); i++) {
            char charPattern = pattern.charAt(i);
            String word = words[i];  // Get the word at the current index

            if (hm.containsKey(charPattern)) {
                if (!hm.get(charPattern).equals(word)) {
                    return false;  // Mismatch in mapping
                }
            } else {
                if (hm.containsValue(word)) {  // If the word is already mapped to another pattern char
                    return false;
                }
                hm.put(charPattern, word);  // Map the pattern char to the word
            }
        }
        return true;
    }
}
