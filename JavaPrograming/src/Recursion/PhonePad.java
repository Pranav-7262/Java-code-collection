package Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padList("","12"));
        System.out.println(padcount("","12"));
    }
    static void pad(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = (up.charAt(0)-'0');
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) (i+'a');
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();
        int digit = (up.charAt(0)-'0');
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) (i+'a');
           list2.addAll(padList(p+ch,up.substring(1)));
        }
        return list2;
    }
    static int padcount(String p,String up){
        if (up.isEmpty()){
            return 1;
        }
        int c = 0;
        int digit = (up.charAt(0)-'0');
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) (i+'a');
           c = c+ padcount(p+ch,up.substring(1));
        }
        return c;
    }
}
