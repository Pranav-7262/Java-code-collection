package Strings;

public class ReverseString {
    public static void main(String[] args) {
      String s="a,b,c,d,e,f,g,h";
      System.out.println(reverseString(s));
    }

    static String reverseString(String s) {
        char[] charArray = s.toCharArray(); // Convert the string to a char array
        int start = 0;
        int end = charArray.length - 1;

        while (start <= end) {
            // Swap characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Return the reversed string
        return new String(charArray);
    }

    }
