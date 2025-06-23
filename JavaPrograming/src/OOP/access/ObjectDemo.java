package OOP.access;

public class ObjectDemo {
    int num;
    String name;
      public ObjectDemo(int num,String name){
          this.num=num;
          this.name=name;
      }

    @Override
    public int hashCode() {
//        return super.hashCode();//Generates some random value
        return num;//prints the actual value
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(7,"Pranav");
        ObjectDemo obj2= new ObjectDemo(7,"Ram");
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        if (obj.equals(obj2)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Nothing");
        }

        System.out.println(obj.getClass());
//        System.out.println(obj instanceof Object);//true
//        System.out.println(obj instanceof ObjectDemo);//true
    }
}
