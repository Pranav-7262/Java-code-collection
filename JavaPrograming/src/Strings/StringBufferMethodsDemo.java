package Strings;

public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, Java!");

        // Append
        sb.append(" Welcome!");
        System.out.println("After Append: " + sb);

        // Insert
        sb.insert(7, "Beautiful ");
        System.out.println("After Insert: " + sb);

        // Replace
        sb.replace(7, 16, "Amazing");
        System.out.println("After Replace: " + sb);

        // Delete
        sb.delete(7, 14);
        System.out.println("After Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // Capacity
        System.out.println("Capacity: " + sb.capacity());
    }
}

