package Bits;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int number = 12; // 1000

        String s = removeLastSetBit(number);
        System.out.println(s); // 1001
    }
    private static String removeLastSetBit(int num ) {

        int n = (num  &  num-1);
        return Integer.toBinaryString(n);
    }
}
