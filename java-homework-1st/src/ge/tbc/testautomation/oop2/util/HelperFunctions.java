package ge.tbc.testautomation.oop2.util;

import ge.tbc.testautomation.oop2.figures.Rectangle;

public class HelperFunctions {

    public static void compareRectangles(Rectangle rect1, Rectangle rect2) {

        if (rect1.getPerimeter() > rect2.getPerimeter()) {
            System.out.println("perimeter 1 > perimeter 2");
        } else if (rect1.getPerimeter() < rect2.getPerimeter()) {
            System.out.println("perimeter 1 < perimeter 2");
        } else {
            System.out.println("perimeter 1 = perimeter 2");
        }
    }
}
