package Bits;

public class CheckIsIthBitSetOrNot {
    public static void main(String[] args) {
        System.out.println(isSetUsingRightShift(13,2)); // 1 1 0 1
    }
    private  static boolean isSet(int n,int i) {
        return ((n & (1 << i)) != 0);// using left shift
    }
    private  static boolean isSetUsingRightShift(int n,int i) {
         return  (( (n >> i) & 1)) == 1; // 0001 &  0001 == 0001 == 1
    }
    }
//(n & (1 << i)) != 0)
// 1 << i
// = 100
// 1101 & 0100 == 0100 which is not 0 , true

//0011
//0001