package OOP.abstractdemo;

public abstract class Parent {//have to made class in abstract
    int age;
    public Parent(int age){
        this.age=age;
    }
    static void greet(){
        System.out.println("hello");
    }
     void greeting(){
        System.out.println("hello GGGG");
    }
    abstract void career(String name);

    abstract void Partbner(String name);

}
