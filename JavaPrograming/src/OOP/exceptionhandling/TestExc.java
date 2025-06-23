package OOP.exceptionhandling;

public class TestExc {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int []arr = new int[6];
//        if (a==b){
//            System.out.println("yes");
//        }
//        else {
//            throw new RuntimeException("error");
//        }

//        try {
//
//            arr[7] = 2;
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println("not divisible by 0");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
        try {
            System.out.println("I am in a try block");
            try {
                arr[7] = 4;

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello I am in a finally");
        }
    }
}
