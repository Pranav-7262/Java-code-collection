package OOP.abstractdemo;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    void greeting(){
        super.greeting();
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
