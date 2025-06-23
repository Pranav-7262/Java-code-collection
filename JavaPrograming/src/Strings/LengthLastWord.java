package Strings;

public class LengthLastWord {
    public static void main(String[] args) {
     String s="Hello world pranav";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        s=s.trim();
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;

    }
}
