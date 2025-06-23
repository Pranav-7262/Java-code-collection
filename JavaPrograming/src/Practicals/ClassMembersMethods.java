package Practicals;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    public void acceptDetails(String n , int a , String c) {
        name = n;
        age = a;
        course = c;
    }
    public void display(){
        System.out.println("name : "+name);
        System.out.println("age :"+age);
        System.out.println("course :"+course);
    }
}
public class ClassMembersMethods {
    public static void main(String[] args) {
        Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name :");
        String name = scanner.nextLine();
        System.out.println("Enter student age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student course :");
        String course = scanner.nextLine();

        student1.acceptDetails(name,age,course);
        student1.display();

    }
}
