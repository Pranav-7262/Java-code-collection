package Strings;

import java.util.Vector;

public class VectorMethodsDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        // Adding elements
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println("Vector: " + v);

        // Adding element at specific index
        v.add(1, "Blueberry");
        System.out.println("After Insert: " + v);

        // Removing element
        v.remove("Banana");
        System.out.println("After Remove: " + v);

        // Getting element at index
        System.out.println("Element at index 1: " + v.get(1));

        // Checking if vector contains an element
        System.out.println("Contains 'Cherry': " + v.contains("Cherry"));

        // Getting size of vector
        System.out.println("Size of Vector: " + v.size());

        // Clearing all elements
        v.clear();
        System.out.println("After Clear: " + v);
    }
}
