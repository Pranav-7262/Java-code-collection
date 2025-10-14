package codeforces;

import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter test cases: ");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int num = sc.nextInt();
            if (num%10==num){
                System.out.println(num);
            }else{
                int mini = Integer.MAX_VALUE;
                while (num!=0){
                    int rem = num%10;
                    mini = Math.min(mini,rem);
                    num = num/10;
                }
                System.out.println(mini);
            }

        }
        sc.close();
    }
}
