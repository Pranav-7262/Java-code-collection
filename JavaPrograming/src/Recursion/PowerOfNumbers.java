package Recursion;

import static Recursion.CountZeros.helper;
import static Recursion.ReverseNum.reverse;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(10));
    }
    public static int reverseExponentiation(int n) {
        int pow = (int)(Math.pow(n , reverse(n)));
   return pow;
    }
        static int reverse(int num) {
        int digits =(int) (Math.log10(num)) + 1;
            return helper(num , digits);
        }
        private static int helper(int n, int digits) {
            if (n % 10 == n) {
                return n;
            }
            int rem = n % 10;
            return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
        }
    }

