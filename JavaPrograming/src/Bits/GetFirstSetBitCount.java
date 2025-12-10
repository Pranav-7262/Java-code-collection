package Bits;

public class GetFirstSetBitCount {
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18)); // 10010
    }
    public static int getFirstSetBit(int n) {
        int count = 1;
        while(n != 0) {
            if((n & 1 )== 1) return count;
            count++;
            n = n >> 1;
        }
        return count;
    }
}
