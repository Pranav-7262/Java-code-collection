package Bits;

public class IsOddEven {
    public static void main(String[] args) {
        int n = 80;
        check(n);
    }
    private static void check(int n) {
        if ((n&1)==1){
            System.out.println("The "+n+" is odd number");
        }
        else{
            System.out.println("The "+n+" is even number");
        }
    }

}
