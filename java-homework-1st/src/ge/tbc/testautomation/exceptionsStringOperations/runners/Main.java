package ge.tbc.testautomation.exceptionsStringOperations.runners;

import ge.tbc.testautomation.exceptionsStringOperations.exceptions.LimitException;
import ge.tbc.testautomation.exceptionsStringOperations.exceptions.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperations.figures.Circle;

public class Main {

    public static void main(String[] args) {

        // radius exception
        try {
            Circle circle = new Circle(-10);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        // limit exception
        try {
            Circle circle2 = new Circle(1);
            Circle circle3 = new Circle(2);
            Circle circle4 = new Circle(3);
            Circle circle5 = new Circle(4);
            Circle circle6 = new Circle(5);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }

        String str = "Test Automation Bootcamp 6, 2022";

        String task1 = str.substring(5, 15).toLowerCase();
        System.out.println(task1);

        String[] task2 = str.split(" ");
        for (String word : task2) {
            System.out.println(word);
        }

        System.out.println(str.length());

        String task4 = str.replace(" ", "-");
        System.out.println(task4);

        String str2 = "Some";
        String str3 = "Some";
        System.out.println(str2 == str3);

        }
}
