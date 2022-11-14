package ge.tbc.testautomation.abstractClassesInterfaces.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.abstractClasses.Figure;

public class Circle extends Figure {

    private double radius;
    private static final double pi = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return pi * this.radius * this.radius;
    }

    @Override
    public double getLength() {
        return 2 * pi * this.radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }
}
