package JavaBasics;

import java.util.Scanner;

public class Inputs1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      System.out.println("Enter your name:");
//        System.out.println("your number is "+input.nextInt());
      //  System.out.println(input.nextLine());
        // System.out.println(input.nextFloat());
//        System.out.println("Enter your roll number:");
//        int rollno = input.nextInt();
//        System.out.println("You roll number is " +rollno);
        String name=input.nextLine();
        System.out.println("Your name no is " + name);
    }
}
