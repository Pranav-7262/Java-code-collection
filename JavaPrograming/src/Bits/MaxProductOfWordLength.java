package Bits;

public class MaxProductOfWordLength {
    public static void main(String[] args) {
  String [] str = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(str));
    }
    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] lengths = new int[n];

        for(int i=0;i<n;i++) {
            int mask = 0;
            for(char ch : words[i].toCharArray()) {
                mask |= 1 << (ch - 'a' );
            }
            masks[i] = mask;
            lengths[i] = words[i].length();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    max = Math.max(max, lengths[i] * lengths[j]);
                }
            }
        }
        return max;
    }
}
