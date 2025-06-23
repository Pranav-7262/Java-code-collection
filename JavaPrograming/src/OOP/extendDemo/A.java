package OOP.extendDemo;

public interface A {
    static void greet(){
        System.out.println("HELLO");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
