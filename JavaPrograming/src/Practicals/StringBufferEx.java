package Practicals;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("welocome");
        System.out.println(buffer);
        System.out.println();
        buffer.insert(7,"pranav");
        System.out.println(buffer);
        System.out.println();
        buffer.replace(7,16, "ram");
        System.out.println(buffer);
        System.out.println();
        buffer.delete(7,12);
        System.out.println(buffer);
        System.out.println();
        buffer.reverse();
        System.out.println(buffer);
        System.out.println();
        System.out.println(buffer.capacity());

    }
}
