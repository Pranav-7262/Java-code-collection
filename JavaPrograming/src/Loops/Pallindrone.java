package Loops;

public class Pallindrone {
    public static void main(String[] args) {


        int num=121123;
        int x=num;
        int ans=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=(ans*10)+rem;
        }
        if(x==ans){
            System.out.println("It is Pallindrone number");
        }
        else {
            System.out.println("it is not Pallindrone num");
        }
    }
}
