package Strings;

public class ValidPalindrone {
    public static void main(String[] args) {
       String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int a = 0;
        int b = s.length() - 1;
        while (a <= b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}

