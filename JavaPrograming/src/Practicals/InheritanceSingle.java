package Practicals;
class Animals {
    public void sleep(){
        System.out.println("they are sleep!");
    }
}
class Dog extends Animals {
    public void bark(){
        super.sleep();
        System.out.println("they are bark");
    }
}
public class InheritanceSingle {
    public static void main(String[] args) {
     Dog d = new Dog();
     d.bark();
    }
}
