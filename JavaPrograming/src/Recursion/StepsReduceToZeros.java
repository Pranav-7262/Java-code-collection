package Recursion;

public class StepsReduceToZeros {
    public static void main(String[] args) {
        System.out.println(steps(41));
    }
    public static int steps(int n){
        return helper(n,0);
    }
    public static int helper(int n,int count){
        if (n==0){
            return count;
        }
        if (n % 2==0){
            return helper(n/2,count+1);
        }
        return helper(n-1,count+1);
    }
}
