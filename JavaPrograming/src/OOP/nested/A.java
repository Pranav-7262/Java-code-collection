package OOP.nested;

public class A { //nesting classes and interfaces
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}


class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num%2)==1;
    }
}
