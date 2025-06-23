package Practicals;

class Example {
    String name;
    int age;

    Example(){
        name = "pranav";
        age = 20;
    }
    Example(String n) {
        name = n;
        age = 19;
    }
    Example(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Example ex = new Example(); //1st

        Example ex2 = new Example("ram"); //2nd

        Example ex3 = new Example("manthan" , 18);  //3rd

        ex.display();
        ex2.display();
        ex3.display();
    }
}
