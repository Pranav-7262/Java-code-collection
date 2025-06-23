package OOP.enumExample;

public class Basic {

        enum week implements A{ //Enums cannot extends  OR it can easily implements interfaces
            Monday, wednesday, thursday, friday, saturday, sunday;
            //These are enum constants
            //public static and final

            week() {
                System.out.println("Constructor for"+this);
            }

            @Override
            public void display() {
                System.out.println("How Are You !!!");
            }
            //this only private or default
            //internally = public static final week monday = new week(); when the constructor is called

            }
    public static void main(String[] args) {
            week week;
            week = Basic.week.Monday;
            week.display();
//        System.out.println(week.values("Monday"));
//            for (week day: week.values()){
//                System.out.println(day);
//            }
//        System.out.println(week);//Monday
//        System.out.println(week.ordinal());//returns position of a week // i.e 0 index
    }
}
