package Bits;

public class NumberOfOneBit {
    public static void main(String[] args) {
        System.out.println(usingBuiltMethod(13));//1101
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }
    private static int method2(int n) { // efficient
        int count = 0;

        while (n != 0) {
            n = n & n-1; //n-1 =  flip first bit 1 to 0 , then rightmost opposite
            count++;
        }
        return count;
    }
    private static int usingBuiltMethod(int n) {
        return Integer.bitCount(n);
    }
}
// 1010 , 10
// 1001 ,  9
