package Strings;

public class Palin {
    public static void main(String[] args) {
        String str="markram";
        System.out.println(ispalindrone(str));
    }
    static boolean ispalindrone(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str=str.toLowerCase();
         int s = 0;
         int e = str.length()-1;

         while (s < e){
             char first = str.charAt(s);
             char last = str.charAt(e);

             if(first != last) {
                 return false;
             }
             s++;
             e--;
         }
        return true;
    }
}
