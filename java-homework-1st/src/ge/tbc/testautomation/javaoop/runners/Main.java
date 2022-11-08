package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();

        Double num1 = 1000 * rd.nextDouble(); // range (0; 1000)
        Circle circle1 = new Circle(num1);
        System.out.println(Circle.numberOfCircleInstances);

        Double num2 = 1000 * rd.nextDouble();
        Circle circle2 = new Circle(num2);
        System.out.println(Circle.numberOfCircleInstances);

        Double num3 = 1000 * rd.nextDouble();
        Circle circle3 = new Circle(num3);
        System.out.println(Circle.numberOfCircleInstances);

        Double num4 = 1000 * rd.nextDouble();
        Circle circle4 = new Circle(num4);
        System.out.println(Circle.numberOfCircleInstances);

        Double num5 = 1000 * rd.nextDouble();
        Circle circle5 = new Circle(num5);
        System.out.println(Circle.numberOfCircleInstances);

        String circle1ToString = Util.circleToString(circle1);
        System.out.println(circle1ToString);

        String circle2ToString = Util.circleToString(circle2);
        System.out.println(circle2ToString);

        String circle3ToString = Util.circleToString(circle3);
        System.out.println(circle3ToString);

        String circle4ToString = Util.circleToString(circle4);
        System.out.println(circle4ToString);

        String circle5ToString = Util.circleToString(circle5);
        System.out.println(circle5ToString);

    }
}
