package Bits;

public class NoOfBitsChangesForEqual {
    public static void main(String[] args) {
        System.out.println(minChanges(13,4));
    }
    public static int minChanges(int n, int k) {
        if ((k & ~n) != 0) {
            return -1;
        }
        return Integer.bitCount(n ^ k);
    }
}
