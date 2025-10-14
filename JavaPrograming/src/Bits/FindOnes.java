package Bits;

public class FindOnes {
    public static void main(String[] args) {
        System.out.println(countOnes(13));
    }
    private static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

}
