package Strings;

public class AddSpaces {
    public static void main(String[] args) {
    String s = "LeetcodeHelpsMeLearn";
    int []spaces = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if (j<spaces.length && spaces[j]==i){
                sb.append(" ");
                j+=1;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
