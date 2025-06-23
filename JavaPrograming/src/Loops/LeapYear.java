package Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        if(days==366){
            System.out.println("It is a Leap Year");
        }
        else if (days==365){
            System.out.println("It is a Normal Year");
        }
        else {
            return;
        }
    }
}
