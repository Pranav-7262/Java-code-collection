package Strings;

public class ConsecutiveChars {
    public static void main(String[] args) {
      String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }
    public static int maxPower(String s) {
        int n = s.length();
        int result = 1;
        int count = 1;
        for (int i = 1; i < s.length()-1; i++) {
            char ch = s.charAt(i-1);
            char cf = s.charAt(i);
            if (ch == cf){
                count++;
            }
            else{
                result = Math.max(result,count);
                count=1;
            }
        }
        result = Math.max(result,count);
        return result;
    }
}
