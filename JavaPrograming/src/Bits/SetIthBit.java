package Bits;

public class SetIthBit { // 0  --> 1 , 1 --> 1
    public static void main(String[] args) {
         int number = 13; // 1101
        int index = 1;
        String str = setBit(number,index);
        System.out.println(str);
    }
    private static String setBit(int num , int i) {
        int i1 = num | (1 << i);
        String s = Integer.toBinaryString(i1);

        return s;
    }
}

