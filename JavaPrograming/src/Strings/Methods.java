package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        String str2 = "  Trim me  ";
        System.out.println("Length: " + str.length());
        System.out.println("Char at index 1: " + str.charAt(1));
        System.out.println("Substring (7,11): " + str.substring(7, 11));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());
        System.out.println("Trimmed: '" + str2.trim() + "'");
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
        String[] words = str.split(", ");
        System.out.println("Split result: " + String.join(" | ", words));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));
        System.out.println("Equals 'hello, java!': " + str.equals("hello, java!"));
        System.out.println("EqualsIgnoreCase 'hello, java!': " + str.equalsIgnoreCase("hello, java!"));
        System.out.println("Concatenation: " + str.concat(" Let's learn!"));
    }
}
