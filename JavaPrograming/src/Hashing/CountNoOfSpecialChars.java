package Hashing;

import java.util.HashSet;

public class CountNoOfSpecialChars {
    public static void main(String[] args) {
       String str = "cCceDC";
        System.out.println(numberOfSpecialChars(str));
    }
    public static int numberOfSpecialChars(String word) {

        HashSet<Character> lowerSeen = new HashSet<>();
        HashSet<Character> invalid = new HashSet<>();
        HashSet<Character> special = new HashSet<>();

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {

                // lowercase after uppercase => invalid
                if (special.contains(ch)) {
                    special.remove(ch);
                    invalid.add(ch);
                }

                lowerSeen.add(ch);

            } else {

                char lower = Character.toLowerCase(ch);

                if (lowerSeen.contains(lower)
                        && !invalid.contains(lower)) {

                    special.add(lower);
                }
            }
        }

        return special.size();
    }
}
