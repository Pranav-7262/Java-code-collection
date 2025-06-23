package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char) ('a'+i);
            //System.out.println(ch);
           builder.append(ch);

        }
        System.out.println(builder.toString());
        builder.delete(0,3);//delete at range
        System.out.println(builder.toString());


        System.out.println(builder.length());//gives a total length
        builder.deleteCharAt(22);
        System.out.println(builder.toString());

        System.out.println(builder.reverse());//reverse
        System.out.println(builder.insert(10,2));
        System.out.println(builder.append(2));
    }
}
