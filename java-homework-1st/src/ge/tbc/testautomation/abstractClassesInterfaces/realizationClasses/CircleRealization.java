package ge.tbc.testautomation.abstractClassesInterfaces.realizationClasses;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.figures.Circle;


public class CircleRealization implements IResizableCircle, IValidCircle {

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {

        double doubledRadius = circle.getRadius() * 2;
        circle.setRadius(doubledRadius);
        return circle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {

        double customRadius = circle.getRadius() * byvValue;
        circle.setRadius(customRadius);
        return circle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        if (circle.getRadius() > 0) { return true; }
        else { return false; }
    }
}
