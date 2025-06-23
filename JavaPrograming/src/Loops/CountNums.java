package Loops;

public class CountNums {
    public static void main(String[] args) {
        int n=55645554;
        int cnt=0;
        while(n>0){
            int rem=n%10;
            if(rem==4){
                cnt++;
            }
            n=n/10;
        }
        System.out.println("Given num is "+cnt+" times presented");
    }
}
