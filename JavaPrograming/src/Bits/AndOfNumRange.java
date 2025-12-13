package Bits;

public class AndOfNumRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }
    public static int rangeBitwiseAnd(int left, int right) {
        int shifts = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        return left << shifts;
    }
}
