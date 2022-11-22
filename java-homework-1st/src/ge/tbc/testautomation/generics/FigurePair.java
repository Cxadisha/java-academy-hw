package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.oop2.figures.Figure;

public class FigurePair<E extends Figure, T extends Figure> {
    private E elementOne;
    private T elementTwo;

    public FigurePair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    @Override
    public String toString() {
        return "FigurePair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }
}
