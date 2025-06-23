package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {


////        Box box = new Box(4.3,4.5,5.6);
////        System.out.println(box.h +" "+ box.l +" "+ box.w);
//        BoxWeight b3 = new BoxWeight();
//        System.out.println(b3.h +" "+ b3.w +" "+ b3.weight);
//
//        Box b4 = new BoxWeight(2,3,4,4);//referencing child via parent class
//        System.out.println(b4.h);
//
//        //Types of inheritance
//        //1.single inheritance-->(One Class Extends another Class)
//
//        //2.MultiLevel inheritance
//        //3.Multiple inheritance(not work in java)
//        //4.hierarchical
//        //hybrid(not in java)
//        BoxWeight b5 = new BoxWeight();
//        b5.greeting();//You can override but you cannot override
//        System.out.println(b5.getL());

                Dog dog = new Dog();
                dog.eat();  // Inherited method
                dog.bark();
                dog.sleep();// Method from Dog class


    }
}