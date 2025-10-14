package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("pranavVarpe"));
    }
    private static String reverse(String s){
        if (s.isEmpty()){
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}
