package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lecture9Runner {
    public static void main(String[] args) {

        // comparing names
        Field[] fields = Analyzable.class.getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            VariableNameAnnotation[] annotations = field.getAnnotationsByType(VariableNameAnnotation.class);
            for (VariableNameAnnotation annotation : annotations) {
                String annotationName = annotation.name();
                if (!annotationName.equalsIgnoreCase(fieldName)) {
                    System.out.println("VARIABLE NAME MISMATCH FOUND. for: " + annotationName + " and " + fieldName);
                }
            }
        }

        // unused fields
        @SuppressWarnings("unused")
        int noPurposeInt = 666;
        @SuppressWarnings("unused")
        String noPurposeString = "Devil";

        // sort arr
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num = 10; num >= 1; num--) {
            arr.add(num);
        }
        Collections.sort(arr);
        System.out.println(arr);

        // comparator
        ArrayList<Rectangle> rectList = new ArrayList<>();

        Rectangle rect1 = new Rectangle(2, 3);
        rectList.add(rect1);
        Rectangle rect2 = new Rectangle(3, 4);
        rectList.add(rect2);
        Rectangle rect3 = new Rectangle(4, 5);
        rectList.add(rect3);
        Rectangle rect4 = new Rectangle(5, 6);
        rectList.add(rect4);
        Rectangle rect5 = new Rectangle(6, 7);
        rectList.add(rect5);
        Rectangle rect6 = new Rectangle(7, 8);
        rectList.add(rect6);
        Rectangle rect7 = new Rectangle(8, 9);
        rectList.add(rect7);
        Rectangle rect8 = new Rectangle(9, 10);
        rectList.add(rect8);
        Rectangle rect9 = new Rectangle(10, 11);
        rectList.add(rect9);
        Rectangle rect10 = new Rectangle(11, 12);
        rectList.add(rect10);

        rectList.sort(new RectangleComparator());
        System.out.println(rectList);
    }
}
