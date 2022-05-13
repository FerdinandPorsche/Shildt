package Page309_2;

public class Circle extends TwoDShape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double width, double height, String name, double radius) {
        super(width, height, name);
        this.radius = radius;
    }

    public Circle(double x, String name, double radius) {
        super(x, name);
        this.radius = radius;
    }

    public Circle(Circle ob, double radius) {
        super(ob);
        this.radius = radius;
    }


    @Override
    double area() {
        return PI * radius * radius;
    }
}
