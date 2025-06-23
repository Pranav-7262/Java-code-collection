package FileHandling.Threads;

//import static OOP.StaticInt;

import OOP.access.A;

public class ExceptionSimple {

//    static void agechecker(int age) {     // throw keyword example...
//        if (age < 18){
//            throw new ArithmeticException("unable to vote!!");
//        } else {
//            System.out.println("able to vote");
//        }
//    }

    public static void main(String[] args)  {
//        int a = 23;
//        int b = 0;
//        try {    // nested try block example...
//            try {
//                int c = a / b;
//            } catch (ArithmeticException e) {
//                System.out.println(e.getMessage());
//            }
//            try {
//                int[] arr = new int[3];
//                arr[4] = 100;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.getMessage());
//            }
//        } catch (Exception e) {
//            System.out.println("everything us okay!!");
//        }
//        System.out.println("normal flow!!");


//        try {   /. Multiple Catch Example !!!
////            int a = 1;
////            int b = a/0;
//            int []arr = new int[4];
//            arr[5] = 0;
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

//        agechecker(16);
     try {
         int a = 12;
         int b = 0,res;
         res = a/b;
     }
      catch (ArithmeticException e) {
          System.out.println(e.getMessage());
      }

    }
}