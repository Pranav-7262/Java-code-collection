package Loops;

import java.util.Scanner;

public class QuestionSet1 {
    public static void main(String[] args) {
        //Q1)--->

//        int a=10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am 10");
//        }
        //--------------------------------------------------------------------
      //  Q2)WAP to find a student pass or fail
//        byte m1,m2,m3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a marks of math3 ");
//        m1=sc.nextByte();
//        System.out.println("Enter a marks of CN");
//        m2=sc.nextByte();
//        System.out.println("Enter a marks of DS");
//        m3=sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulation!! YOu are promoted");
//        }
//        else {
//            System.out.println("You're Not promoted,Better Luck Next Time!!!");
//        }
//
        //------------------------------------------------------------------------
     //   Q3)WAP to find day of week given number

        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");

        }
    }
}
