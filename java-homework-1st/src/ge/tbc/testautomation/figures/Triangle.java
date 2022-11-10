package ge.tbc.testautomation.figures;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;
    private double h = 3;

    public Triangle(double side1, double side2, double base) {
        a = side1;
        b = side2;
        c = base;
    }

    @Override
    public double getArea() {
        return c * h / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
