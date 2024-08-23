package core.basesyntax;

public class Square extends FigureBase {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + color);
    }
}
