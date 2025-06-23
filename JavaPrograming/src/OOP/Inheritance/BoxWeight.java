package OOP.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-2;
    }

    BoxWeight(BoxWeight old){
        super(old);
        weight= old.weight;
    }
    public BoxWeight(double l,double h,double w,double weight){
        super(l, h, w);//calling the parent class constructor
        this.weight = weight;
    }
}
