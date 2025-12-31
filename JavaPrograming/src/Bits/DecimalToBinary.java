package Bits;

public class DecimalToBinary {
    public static void main(String[] args) {
        int x = 13;
        System.out.println(convertToBinaryNew(x));
    }
    private static String convertToBinary(int x) {
        StringBuilder result = new StringBuilder();

        while (x != 0) {
            if (x % 2 == 1) result.append('1');
            else  result.append('0');
            x /= 2;
        }

        return result.reverse().toString();
    }
    private static String convertToBinaryNew(int x) {

        return Integer.toBinaryString(x);

    }
}
