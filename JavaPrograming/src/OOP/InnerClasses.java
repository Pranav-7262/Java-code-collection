package OOP;

public class InnerClasses {//outside classes are not static (remember)
 static class Test{//inner classes can be static  //'Without static 'this' cannot be referenced from a static context
         String name;
         public Test(String name){
             this.name=name;
         }

     @Override
     public String toString() {
         return name;
     }
 }

    public static void main(String[] args) {
        Test a= new Test("Pranav");
        Test b = new Test("Ram");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
        System.out.println(b);


    }

}

