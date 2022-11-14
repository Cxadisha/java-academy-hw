package ge.tbc.testautomation.oop2.runners;

import ge.tbc.testautomation.oop2.figures.Rectangle;
import ge.tbc.testautomation.oop2.figures.Triangle;
import ge.tbc.testautomation.oop2.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 15);
        double area = rect.getArea();
        double perimeter = rect.getPerimeter();
        System.out.println("rectangle area = " + area + ", rectangle perimeter = " + perimeter);

        Triangle tr = new Triangle(5, 6, 7);
        double trArea = tr.getArea();
        double trPerimeter = tr.getPerimeter();
        System.out.println("triangle area = " + trArea + ", triangle perimeter = " + trPerimeter);

        // bonus
        Rectangle rect2 = new Rectangle(11, 13);
        HelperFunctions.compareRectangles(rect, rect2);
    }
}
