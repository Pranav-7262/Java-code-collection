package Strings;

public class AreAlmostEqual {
    public static void main(String[] args) {
    String s1 =  "bank";
    String s2 = "kanb";
    System.out.println(areAlmostEqual(s1,s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int[] differIndex = new int[2];
        int differCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (differCount == 2) {
                    return false;
                }
                differIndex[differCount++] = i;
            }
        }
        if (differCount != 2) {
            return false;
        }
            int i = differIndex[0];
            int j = differIndex[1];
       return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}
