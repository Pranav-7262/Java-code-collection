package Recursion;

public class ReverseNum {

    static int sum = 0;

    static void reverse(int n) {
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10+ rem;
        reverse(n/10);

    }
    public static void main(String[] args) {
        reverse(123902624);
        System.out.println(sum);
    }
}

