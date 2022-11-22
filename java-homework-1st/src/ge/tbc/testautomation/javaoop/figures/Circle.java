package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.oop2.figures.Figure;

public class Circle extends Figure {

    private double radius;
    public static int numberOfCircleInstances;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;
    }

}
