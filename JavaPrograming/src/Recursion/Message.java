package Recursion;
//Recursion is nothing but function calling another function
public class Message {
    public static void main(String[] args) {
        //write a program to print Hello World 5 times
        message1();
    }
    static void message1(){
        System.out.println("1.Hello World");
        message2();
    }
    static void message2(){
        System.out.println("2.Hello World");
        message3();
    }
    static void message3(){
        System.out.println("3.Hello World");
        message4();
    }
    static void message4(){
        System.out.println("4.Hello World");
        message5();
    }
    static void message5(){
        System.out.println("5.Hello World");
    }


}
