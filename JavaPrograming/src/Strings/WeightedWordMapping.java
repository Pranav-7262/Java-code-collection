package Strings;

import java.awt.*;

public class WeightedWordMapping {
    public static void main(String[] args) {
        String []str = {"abcd","def","xyz"};
        int [] wgts = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(str,wgts));
    }
    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(String str : words) {
            int sum = 0;
            for(char ch : str.toCharArray()) {
                sum +=  weights[ch - 'a'];
            }
            int mod = sum % 26;
            char mapped = (char) ('z' - mod);
            sb.append(mapped);
        }
        return sb.toString();
    }
}
