package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.oop2.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Lecture10Runner {
    public static void main(String[] args) {

        // any pair
        var anyPair = getDeclaredFields(5, "someString");
        var elementOneList = Arrays.asList(anyPair.getElementOne());
        var elementTwoList = Arrays.asList(anyPair.getElementTwo());
        System.out.println(elementOneList);
        System.out.println(elementTwoList);

        // 7)
        Rectangle rect = new Rectangle(10,15);
        Circle circle = new Circle(12);
        FigurePair<Circle,Rectangle> pair = new FigurePair<Circle,Rectangle>(circle, rect);

        // 8)
        System.out.println(pair);
    }

    private static <K, D> AnyPair<Field[],Field[]> getDeclaredFields(K objOne, D objTwo) {

        var obj1Field = objOne.getClass().getDeclaredFields();
        var obj2Field = objTwo.getClass().getDeclaredFields();

        return new AnyPair<Field[],Field[]>(obj1Field, obj2Field);
    }
}
