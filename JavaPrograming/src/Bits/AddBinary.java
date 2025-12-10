package Bits;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
     String a = "11", b = "1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger ans = num1.add(num2);
        return ans.toString(2);
    }
}
