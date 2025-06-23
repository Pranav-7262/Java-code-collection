package Practicals;
interface A {
    void makeSound();
}
interface B {
    void sleep();
}
class Puppy implements A,B {
    public void makeSound() {
        System.out.println("can make sound");
    }

    @Override
    public void sleep() {
        System.out.println("can sleep");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Puppy dog = new Puppy();
        dog.makeSound();
        dog.sleep();
    }
}
