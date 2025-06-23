package Strings;

public class ReverseWordString {
    public static void main(String[] args) {
      String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        String []words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >= 0 ; i--) {
            sb.append(words[i]);
            if (i!=0){
                sb.append(" ");
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
