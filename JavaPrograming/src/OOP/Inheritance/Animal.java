package OOP.Inheritance;

public class Animal{
    // Parent class
        void eat() {
            System.out.println("This animal eats food.");
        }

        void sleep(){
            System.out.println("Able to Sleep");
        }
    }

    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
        void sleep(){
            super.sleep();
        }


    }

    // Main class


