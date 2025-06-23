package Loops;

import javax.xml.transform.Source;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
//        int a=10;
//        if(a==10){
//            System.out.println("hello world!");
//        }
//        else {
//            System.out.println("pranav");
//        }

     Scanner sc=new Scanner(System.in);
     System.out.println("enter your number :");

     int a=sc.nextInt();
     if(a%2==0){
         System.out.println("even number");
     }
     else {
         System.out.println("odd number");
     }
    }
}
