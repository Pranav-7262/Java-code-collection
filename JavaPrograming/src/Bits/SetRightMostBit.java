package Bits;

public class SetRightMostBit {
    public static void main(String[] args) {
        System.out.println(setBit(13)); // 1101 --> 1111
    }
    static int setBit(int n) {
        // code here
        return n | (n + 1);
    }
}
