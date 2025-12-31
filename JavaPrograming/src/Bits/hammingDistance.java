package Bits;

public class hammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(4,14));
    }
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            count += (xor & 1);
            xor >>= 1;
        }
        return count;
    }
}
// 1101
// 1000
// 0010