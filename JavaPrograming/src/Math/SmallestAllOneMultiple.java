package Math;

public class SmallestAllOneMultiple {
    public static void main(String[] args) {
        System.out.println(minAllOneMultiple(7));

    }
    public static int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int remainder = 1 % k;
        int length = 1;
        while(remainder != 0) {
            remainder = (remainder * 10 + 1) % k;
            length++;
        }
        return  length;
    }
}
