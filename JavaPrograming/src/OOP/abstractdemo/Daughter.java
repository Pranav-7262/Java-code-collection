package OOP.abstractdemo;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("name is "+name);
    }

    @Override
    void Partbner(String name) {
        System.out.println("I name is "+name+" and I am "+age+"th");
    }
}
