package Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "bac";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int first =0;
        int second=0;
        while (first<s.length() && second<t.length()) {
            if (s.charAt(first) == t.charAt(second)) {
                first++;
                second++;
            } else {
                second++;
            }
            if (first==s.length()){
                return true;
            }

        }
        return false;
    }
}
