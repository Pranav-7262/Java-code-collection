package Bits;

public class SumofTwoNum {
    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }
    public static int getSum(int a, int b) {

        while (b != 0) {
            int carry = (a & b) << 1; // carry
            a = a ^ b;               // sum without carry
            b = carry;               // propagate carry
        }
        return a;
    }
}
//
