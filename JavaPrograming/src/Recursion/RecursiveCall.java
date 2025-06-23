package Recursion;

public class RecursiveCall {
    public static void main(String[] args) {
        //print 1 to 10 numbers

        print(1);

    }
    static void print(int n){
        if (n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        print(n+1);

    }
}
