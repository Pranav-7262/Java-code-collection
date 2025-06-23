package OOP.PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape square =new Square();
        Shape triangle = new Triangle();
        shape.area();
        circle.area();//prints circles area
        triangle.area();
        square.area();

        //types
        //1.Compile Time /Static poly..(Achieved via method overloading)same name
        //2.Runtime / dynamic (Achieved via method overriding)
    }
}
