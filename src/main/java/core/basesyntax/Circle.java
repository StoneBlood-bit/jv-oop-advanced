package core.basesyntax;

public class Circle implements Figure {
    private String color;
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
