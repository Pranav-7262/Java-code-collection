package OOP;

public class Intro {
    public static void main(String[] args) {


        //what is class
        //It is a contains of different value OR group of properties and functions

        //data of 5 students
//        int[] student = new int[5];


        //  data of students (rollno,name,marks)
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];


//        Student[] Students = new Student[5];

        Student pranav = new Student(110, "Pranav", 90.9f, 5758754L);
        Student random = new Student();
        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.salary);
        System.out.println(random2.mark);
//        System.out.println(random.name);
//        System.out.println(random.mark);
//        System.out.println(random.rno);
//        System.out.println(random.salary);
        pranav.changename("PRO_NAV");
        pranav.greet();//constructor
//        System.out.println(pranav.rno);
//        pranav.name="pranav";
//        pranav.mark=94.00f;
//        pranav.salary=67479369L;
//        System.out.println(pranav);//any value
//        System.out.println(pranav.rno);//0 (default)
//        System.out.println(pranav.mark);//0.0
//        System.out.println(pranav.name);//null
//        System.out.println(pranav.salary);
//        Student one = new Student();
//        Student two = one;
//        one.name = "Pranav_Varpe";
//        System.out.println(two.name);

        //final keyword
//        final int bonus = 2;
//        bonus=5;//cant assign the value
//        A obj;
//        for (int i = 0; i < 10; i++) {
//            obj = new A("Random name");
//        }



    }
}

    //generate class
    class Student{

        int rno;
        String name;
        float mark;
        long salary;

        void greet() {
            System.out.println("Hello from " + this.name);
        }

        void changename(String newname) {
            name = newname;
        }

        Student(Student other) {
            this.rno = other.rno;
            this.name = other.name;
            this.mark = other.mark;
            this.salary = other.salary;
        }

        Student() { //constructor
            this(23, "Pranav_varpe", 90.9f, 2000000L);
        }

        Student(int roll, String name, float mark, long salary) { //constructor
            this.rno = roll;
            this.name = name;
            this.mark = mark;
            this.salary = salary;
        }
    }



//        final A pranav = new A("Pranav");
//          pra
//        }


    class A {
        final int num = 9;
        String name;

        public A(String name) {
            System.out.println("object created!");
            this.name = name;

        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed!1");
        }
    }


//eg of class(real time) ---> car(color,size,brand etc.)
