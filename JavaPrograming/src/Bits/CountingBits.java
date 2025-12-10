package Bits;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
       int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;
        for(int i=1;i<=n;i++) {
            answer[i] = method(i);
        }
        return answer;
    }
    private static int method(int n) {
        int count = 0;
        while (n != 0) {
            n = n & n-1;
            count++;
        }
        return count;
    }
}
