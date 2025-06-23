package Functions;

public class Shadowing {
    static int x=89;
    public static void main(String[] args) {
        System.out.println(x);//89
        int x=90;
        System.out.println(x);//90
        fun();//89
    }
    static void fun(){
       // int x=23;
        System.out.println(x);
    }
}
