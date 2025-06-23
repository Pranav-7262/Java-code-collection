package OOP;

public class Human {
    int age;
    long salary;
    String name;
     boolean married;
     static long population;

     //static keyword
    static void message(){
        System.out.println("Hello");
       // System.out.println(this.age);//You cant use the obj in a static class because static keyword in cannot dependent on a objects.
    }

     public Human(int age,long salary,String name,boolean married){
         this.age=age;
         this.salary=salary;
         this.name=name;
         this.married=married;
         Human.population += 1;
     }
}
