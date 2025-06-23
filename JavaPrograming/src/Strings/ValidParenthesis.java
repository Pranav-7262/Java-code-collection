package Strings;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(validParenthesis(s));
    }
 static boolean validParenthesis(String s){
        while (true){
            if (s.contains("()")){
                s=s.replace("()","");
            }
             else if (s.contains("{}")){
                s=s.replace("{}","");
            }
            else if (s.contains("[]")){
                s=s.replace("[]","");
            }
            else {
                if (s.isEmpty()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

    }
}
