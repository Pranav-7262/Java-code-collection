package Loops;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
     //   Q)print 1 to n numbers
//        for(int i=0;i<=100;i++){
//            System.out.println(i);
//        }

 //       Q)print odd num 1 to n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
    }
}
