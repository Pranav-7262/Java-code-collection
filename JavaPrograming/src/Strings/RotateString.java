package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s ="abcde";
        String goal = "abced";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() == goal.length() && (s + s).contains(goal)) {
            return true;
        }
        return false;
    }
}
