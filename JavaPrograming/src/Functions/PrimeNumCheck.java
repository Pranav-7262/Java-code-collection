package Functions;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int m1=sc.nextInt();
        boolean ans=isprime(m1);
        System.out.println(ans);

    }
    static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c <= n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        if (c*c > n){
            return true;
        }
        return false;
    }
}
