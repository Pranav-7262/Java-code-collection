package Strings;

public class CountSubString {
    public static void main(String[] args) {
    String str = "abcabc";
        System.out.println(countSubstring(str));
    }
    public static int countSubstring(String s) {
        int []count = {0,0,0};
        int left=0,result=0;
        for (int i = 0; i <s.length() ; i++) {
            count[s.charAt(i)-'a']++;

            while (count[0]>0 && count[1]>0 && count[2]>0){
                result += s.length() - i;
                count[s.charAt(left)-'a']--;
                left++;
            }
        }
        return result;
    }
}
