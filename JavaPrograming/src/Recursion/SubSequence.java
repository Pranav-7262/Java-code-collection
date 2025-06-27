package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        subseq("","abc");
//        System.out.println(subSeqReturn("","abc"));
        System.out.println(subSeqReturnAscii("","ab"));
      }
    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));//took it
        subseq(p,up.substring(1));//ignore
    }
    static ArrayList<String> subSeqReturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

       ArrayList<String> left =  subSeqReturn(p+ch,up.substring(1));//took it
        ArrayList<String> right =  subSeqReturn(p,up.substring(1));//ignore
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subSeqReturnAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first =  subSeqReturnAscii(p+ch,up.substring(1));//took it
        ArrayList<String> second =  subSeqReturnAscii(p,up.substring(1));//ignore
        ArrayList<String> third=  subSeqReturnAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
