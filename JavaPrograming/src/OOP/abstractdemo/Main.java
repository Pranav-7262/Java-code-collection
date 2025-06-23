package OOP.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Parent son  = new Son(77);
        son.career("pranav");
        son.Partbner("Ram");
        Parent daughter = new Daughter(29);
        daughter.career("ss");
        daughter.Partbner("ss");
        Parent.greet();
        son.greeting();
        daughter.greeting();
//        Parent mom = new Parent()// cant make an object of abstract
        //Interfaces contains Abstract functions (final,static)


    }
}
