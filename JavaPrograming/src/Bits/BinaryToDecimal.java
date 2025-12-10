package Bits;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str = "11001";
        System.out.println(convertToDecimal(str));
    }
    private static int convertToDecimal(String str) {
        int len = str.length();
        int power = 0 , sum  = 0 ;
        for (int i = len-1; i >=0; i--) {
            int number = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += (int) (Math.pow(2,power)  * number);
            power++;
        }
        return sum;

    }
}
