package ge.tbc.testautomation.annotationsAndComparators;

import java.lang.reflect.Field;

public class Analyzable {

    @VariableNameAnnotation(name = "Num")
    public static int num = 5;
    @VariableNameAnnotation(name = "Num2")
    int num2 = 6;
    @VariableNameAnnotation(name = "Num3")
    int num3 = 7;

    @VariableNameAnnotation(name = "Str")
    String str = "some string";
    @VariableNameAnnotation(name = "Str2")
    String str2 = "some string2";
    @VariableNameAnnotation()
    String str3 = "some string3";

    @VariableNameAnnotation(name = "DoubleNum")
    double doubleNum = 5.0;
    @VariableNameAnnotation(name = "DoubleNum2")
    double doubleNum2 = 5.1;

    @VariableNameAnnotation(name = "someOtherName")
    boolean bool = true;
    @VariableNameAnnotation(name = "Bool2")
    boolean bool2 = false;
}
