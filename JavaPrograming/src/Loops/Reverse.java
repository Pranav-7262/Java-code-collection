package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

        int num=sc.nextInt();
        int ans=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=(ans*10)+rem;
        }
        System.out.println("The required reversed number is:");
        System.out.println(ans);
    }
}
