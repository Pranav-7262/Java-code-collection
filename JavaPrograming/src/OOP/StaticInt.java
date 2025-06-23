package OOP;

public class StaticInt {
    static int a=2;
    static int b;
     static {//will only runs once when first obj is created
         System.out.println("I am static");
         b = a*4;
     }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a +" "+ StaticInt.b);

        StaticInt.b += 3;
        System.out.println(StaticInt.b);

        StaticInt obj2 = new StaticInt();//not run
        System.out.println(StaticInt.b);

    }
}
