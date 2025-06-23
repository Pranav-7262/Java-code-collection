package OOP.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(69,"pranav");
      //  System.out.println(obj.name);
//        System.out.println(obj.num); num cant be accessed coz it is private

        System.out.println(obj.getNum());//it is valid
        int n  = obj.num;//protected is accessible via subclass also
        System.out.println(obj.getName());
        System.out.println(obj instanceof A);//true
    }

}
