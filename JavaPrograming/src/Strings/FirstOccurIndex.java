package Strings;

public class FirstOccurIndex {
    public static void main(String[] args) {
       String haystack = "a";
       String needle = "a";
        System.out.println(strStr(haystack,needle));
    }
    public  static int strStr(String haystack, String needle) {

       int start = haystack.length();
       int end = needle.length();
       if (haystack.length()==needle.length()){
           return -1;
       }

        for (int i = 0; i < (haystack.length() - needle.length()); i++) {
            if (haystack.substring(i,i+end).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
