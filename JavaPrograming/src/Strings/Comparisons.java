package Strings;

public class Comparisons {
    public static void main(String[] args) {
        String a="pranav";
        String b="pranav";

        System.out.println(a==b); //true coz pointing to same objects

        String name1=new String("Pranav");
        String name2=new String("Pranav");
//        System.out.println(name1==name2);//false coz they aren't point to the same object


        System.out.println(name1.equals(name2));//true

        System.out.println(name1.charAt(3));
    }

}
