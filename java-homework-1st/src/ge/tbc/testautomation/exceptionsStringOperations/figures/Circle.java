package ge.tbc.testautomation.exceptionsStringOperations.figures;

import ge.tbc.testautomation.exceptionsStringOperations.exceptions.LimitException;
import ge.tbc.testautomation.exceptionsStringOperations.exceptions.RadiusException;

public class Circle extends Figure {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {

        this.radius = radius;

        if (numberOfInstances > 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }

        if (this.radius < 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
    }
}
