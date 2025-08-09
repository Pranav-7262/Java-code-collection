package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    public static boolean isPowerOfTwo(int n) {

        if (n == 1){
            return true;
        }
        if (n % 2!= 0 || n <= 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
