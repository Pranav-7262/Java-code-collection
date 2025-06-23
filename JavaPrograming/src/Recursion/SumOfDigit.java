package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(digit_sum(1234));
    }
    static int digit_sum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10)+digit_sum(n/10);
    }
}
