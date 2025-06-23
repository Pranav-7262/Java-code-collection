package OOP.access;

public class A {
     private String name;//private things is not access until we use getNum and setNum
    protected int num;
    int []arr;

    public int getNum() {//public is accessible at any where
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.name=name;
        this.num=num;
        this.arr = new int[34];
    }
}
