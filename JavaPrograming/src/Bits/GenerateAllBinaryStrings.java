package Bits;

import java.util.ArrayList;

public class GenerateAllBinaryStrings {
    public static void main(String[] args) {
        System.out.println(binstr(3));
    }
    public static ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            result.add(binary);
        }

        return result;

    }
}
