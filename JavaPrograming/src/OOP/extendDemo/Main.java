package OOP.extendDemo;

public class Main implements A,B{

    @Override
    public void greet() {

    }


    public static void main(String[] args) {
        Main obj = new Main();
        A.greet();//static methods are called using A interface name
        obj.fun();
    }
}
