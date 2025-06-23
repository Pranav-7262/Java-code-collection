package OOP.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student pranav = new Student(69,94.4f);
    Student yash = new Student(73,95.4f);
    Student rahul = new Student(73,89.4f);
    Student shreyas = new Student(73,79.4f);

    Student [] list = {pranav,yash,rahul,shreyas};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    if(pranav.compareTo(yash) < 0){
        System.out.println(pranav.compareTo(yash));
        System.out.println("Yash has more marks than Pranav");
    }
}
}
