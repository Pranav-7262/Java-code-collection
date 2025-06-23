package Practicals;

import java.util.Scanner;

public class UnsignedRightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();

        System.out.println("Enter shift count:");
        int shift = scanner.nextInt();
        int unsigned = integer >>> shift;
        System.out.println("Unsigned result : "+unsigned);
    }
}
