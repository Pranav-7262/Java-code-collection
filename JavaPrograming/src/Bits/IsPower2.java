package Bits;

public class IsPower2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32)); // 1000 & 0111 == 0
    }
    private static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
