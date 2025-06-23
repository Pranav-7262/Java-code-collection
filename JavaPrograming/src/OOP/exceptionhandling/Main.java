package OOP.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try { // just try it..
//            divide(a,b);//  / by 0
//            throw new Exception("just for fun");
            String name = "pranav";
            if (name.equals("pranav")){
                throw new MyException("name is pranav");
            }
        } catch (MyException e) { // catch and print
            System.out.println(e.getMessage());
        }
        catch (Exception e) { // catch and print
            System.out.println("normal Exception");
        }
        finally {// will Always Executed
            System.out.println("This will Always Executed");
        }



}
 public static int divide(int a,int b) throws ArithmeticException{ // throws used to declare Exception
    if (b==0){
        throw new ArithmeticException("Please do not use 0");
    }
    return a/b;
}
}

