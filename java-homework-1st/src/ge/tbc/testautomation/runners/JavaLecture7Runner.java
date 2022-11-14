package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.realizationClasses.CircleRealization;

public class JavaLecture7Runner {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        CircleRealization circleRlz = new CircleRealization();
        double originalRadius = circle.getRadius();
        circleRlz.returnDoubleSizedCircle(circle);
        System.out.println("Starting radius was: " + originalRadius + ", doubled: " + circle.getRadius());

        double doubledRadius = circle.getRadius();
        circleRlz.returnCustomSizedCircle(circle, 3);
        System.out.println("Multiplied by : " + circle.getRadius() / doubledRadius + ", result: " + circle.getRadius());

        System.out.println("Is radius positive? -" + circleRlz.validateCircle(circle));

        System.out.print("Package: ");
        circle.printPackageName();

        System.out.println("Circle length: " + circle.getLength());
        System.out.println("Circle area: " + circle.getArea());

    }
}
