package prototypepattern;

public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Square draw() method");
    }
}
