package Bits;

public class ToggleIthBit {
    public static void main(String[] args) {
        int number = 13; // 1101
        int index = 1;
        String s = toggleIthBit(number,index);
        System.out.println(s); // 1001
    }
    private static String toggleIthBit(int num , int i) {

        int n = num  ^  (1 << i);
        return Integer.toBinaryString(n);
    }
}
