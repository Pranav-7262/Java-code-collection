package Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you first element");
        int a=sc.nextInt();
        System.out.println("enter second element");
        int b=sc.nextInt();
        System.out.println("enter third element");
        int c=sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }else {
            max=a;
        }
        if(c>max){
            max=c;

        }
        System.out.println("The Biggest element is:");
        System.out.println(max);
    }
}
