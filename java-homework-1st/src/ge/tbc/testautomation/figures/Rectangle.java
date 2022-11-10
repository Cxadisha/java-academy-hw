package ge.tbc.testautomation.figures;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double width, double height) {
        a = width;
        b = height;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
