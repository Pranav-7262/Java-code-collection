package FileHandling.Threads;


    class X extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("from thread X :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}
   class ExtendThreadClass {
      public static void main(String[] args) {
//          new X().start();

//          Thread t = new X();
//          t.start();

          X xx = new X();
          xx.start();


      }
  }

