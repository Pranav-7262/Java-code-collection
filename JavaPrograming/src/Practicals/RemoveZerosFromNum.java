
package Practicals;

public class RemoveZerosFromNum {
    public static void main(String[] args) {
        System.out.println(removeZeros(1020030));
    }
    public static long removeZeros(long n) {

        String str = Long.toString(n);

        str = str.replace("0","");

        return Long.parseLong(str);

    }
}
