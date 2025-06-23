package OOP.Inheritance;

public class Box {
    private double l;//data hiding
    double h;
    double w;
   // double w3;
//    @Override
    static void greeting(){//static cant override
        System.out.println("Hello from greetings");
    }

    public double getL() {
        return l;//acccess
    }

    Box(){
        this.l = -1;
        this.h= -1;
        this.w = -1;

    }
    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    Box(double l ,double h,double w){
        this.w = w;
        this.l = l;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box..");
    }
}
