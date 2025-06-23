package JavaBasics;

import java.util.Scanner;

public class QuestionSet {
    public static void main(String[] args) {

        //Q1)WAP to sum 3 numbers in java
//        int a=10;
//        int b=20;
//        int c=30;
//        int sum=a+b+c;
//        System.out.println("your sum is : ");
//        System.out.println(sum);

//        Q2)calculate cgpa of 3 subjects
//        float subject1=90;
//        float subject2=90;
//        float subject3=80;
//        float cgpa = (subject1+subject2+subject3)/30;
//        System.out.println(cgpa);

//        Q3)user
//        System.out.println("what is your name");
//        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        System.out.println("hello " + name +" have a good Day");

//        Q4)integer num or not
//        System.out.println("enter your number");
//        Scanner sc=new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

//        Q5) Encrypt and decrypt grade
        char grade = 'B';//Encryption
        grade =(char) (grade+8);
        System.out.println(grade);

        //decryption
        grade =(char) (grade-8);
        System.out.println(grade);

    }
}
