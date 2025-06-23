package Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
    String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
    StringBuilder Stack = new StringBuilder();
    for (char c:s.toCharArray()){
        if (Stack.length()>0 && Stack.charAt(Stack.length()-1)==c){//if the element is duplicated , then just remove the char at its index
            Stack.deleteCharAt(Stack.length()-1);
        }
        else{
            Stack.append(c);//if character is new then insert in the Stack.
        }
    }
    return Stack.toString();
    }
}
