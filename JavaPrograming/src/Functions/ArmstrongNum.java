package Functions;

import java.util.Scanner;

public class ArmstrongNum {//sum of cube of all its digits is its num.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int m1=sc.nextInt();
        boolean ans=isarmstrong(m1);
        System.out.println(ans);

    }
    static boolean isarmstrong(int n){
        int sum=0;
        int original=n;
        while (n>0){
            int rem=n%10;
            n=n/10;
            sum += rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
    }
