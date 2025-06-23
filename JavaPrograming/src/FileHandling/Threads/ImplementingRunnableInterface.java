package FileHandling.Threads;

 class Y implements Runnable {

     @Override
     public void run() {
         int sum = 0;
         for (int i = 0; i < 10; i++) {
             sum += i;
         }
         System.out.println(sum);
     }
 }
public class ImplementingRunnableInterface {
    public static void main(String[] args) {
//        Y yy  = new Y();
//        Thread thread = new Thread(yy);
//        thread.start();

        new Y().run();
    }

}
