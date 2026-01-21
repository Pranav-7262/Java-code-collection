package Bits;

public class ClearIthBit {// 1 -> 0 , 0  -> 0
    public static void main(String[] args) {
        int number = 13; // 1101
        int index = 2;
         String s = clearIthBit(number,index);
        System.out.println(s); // 1001
    }
    private static String clearIthBit(int num , int i) {

        int n = num  & (~(1 << i));
        return Integer.toBinaryString(n);
    }


}
//  1101
 // 1011  => negation of 1 << i (0100)  1011
 // 1001 (ans)
