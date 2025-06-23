package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//      int ans =sum2();
//        System.out.println(ans);
//        int ans=sum3(23,56);
//        System.out.println(ans);
//        int ans=sum2();
//        System.out.println(ans);
        int pranav=sum3(23,45,78,35);
        System.out.println(pranav);
    }
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        int m1=sc.nextInt();
        System.out.println("Enter Second value");
        int m2=sc.nextInt();
        int sum=m1+m2;
        System.out.println("The Sum is :");
        return sum;//Terminates the function..
    }
        static int sum3(int a,int b){
        int sum=a+b;
        return sum;
        }
    static int sum3(int a,int b,int c,int d){
        int sum=a+b+c+d;
        return sum;
}
}
