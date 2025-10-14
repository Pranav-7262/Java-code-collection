package SlidingWindow;

public class MaxVowelsWithLengthK {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }
    public static int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int n = s.length();
        int count = 0;
        for(int e=0;e<n;e++) {
            if(isVowel(s.charAt(e))){
                count++;
            }
            if (e >= k && isVowel(s.charAt(e - k))) {
                count--;
            }
            max  = Math.max(max , count);
        }
        return max;
    }
    private static boolean isVowel(Character ch) {
        return (ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u');
    }
}
