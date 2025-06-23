package Functions;

public class Greeting {
    public static void main(String[] args) {
        //greeting();
        String personalised=myname("Pranav Varpe");
        System.out.println(personalised);
    }
    static void greeting(){
        System.out.println("Hello World!");
        System.out.println("Pranav");
    }
    static String myname(String name){
        String message="Hello "+name;
        return message;
    }
}
