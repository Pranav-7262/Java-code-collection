package FileHandling.Threads;

 class AgeInvalidException extends Exception {
    public AgeInvalidException(String message){
        super(message);
    }
}
public class Test {
    public static void checkage(int age) throws AgeInvalidException {
        if (age < 18) {
           throw new AgeInvalidException("unable to vote !!!");
        } else {
            System.out.println("Able to vote !!!");
        }
    }

    public static void main(String[] args) {
        try {
            checkage(15);
        }catch (AgeInvalidException e){
            System.out.println(e);
        }

    }
}

