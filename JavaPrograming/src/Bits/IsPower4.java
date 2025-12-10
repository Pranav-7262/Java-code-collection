package Bits;

public class IsPower4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
    public static boolean isPowerOfFour(int n) {
        // Check if n is positive and power of 2
        if (n <= 0 || (n & (n - 1)) != 0)
            return false;

        // Check if the 1-bit is at an even position
        return (n & 0xAAAAAAAA) == 0;
    }
}
