package Bits;

public class BinaryNumWithAlternatingBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
    public static boolean hasAlternatingBits(int n) {

        String s = Integer.toBinaryString(n);
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
}
