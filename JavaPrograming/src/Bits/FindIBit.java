package Bits;

public class FindIBit {
    public static void main(String[] args) {
        System.out.println(findBit(13,2)); // 1 1 0 1
    }
    private static int findBit(int  n , int i) {
        return (n >> i) & 1;
    }

}
//(n >> i) & 1;
// 13 >> 2
// 13 / 4 = 3
// 3 & 1  = 0011 & 0001 == 0001 == 1