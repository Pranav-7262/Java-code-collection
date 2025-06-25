package Recursion;

public class PrintWordNTimes {
    public static void main(String[] args) {
     printGfg(10);
    }
   static void printGfg(int N) {
        if (N == 0) {
            return;
        }
        printGfg(N - 1);
       System.out.print("Pranav"+" ");
    }
}
