
package Practicals;

public class RemoveZerosFromNum {
    public static void main(String[] args) {
        System.out.println(removeZeros(1030));
    }
    public static long removeZeros(long n) {

        if (n < 10) {
            return (n == 0) ? 0 : n;   // If last digit is 0, remove it
        }

        long last = n % 10;
        long rest = removeZeros(n / 10);

        if (last == 0) {
            return rest;              // Skip zeros
        } else {
            return rest * 10 + last;  // Append digit back
        }

    }
}
