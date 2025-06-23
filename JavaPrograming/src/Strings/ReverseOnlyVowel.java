package Strings;

public class ReverseOnlyVowel {
    public static void main(String[] args) {
    String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
      int n = s.length();
      int start = 0;
      int end = s.length()-1;
      char [] ch = s.toCharArray();

      while (start<end){
          if (!vowel(ch[start])){
              start++;
          } else if (!vowel(ch[end])) {
              end--;
          }
          else {
              char temp = ch[start];
              ch[start] = ch[end];
              ch[end] = temp;
              start++;
              end--;
          }

      }
      return String.valueOf(ch);
    }
    public static boolean vowel(char ch){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I'){
            return true;
        }
        return false;
    }
}
