package figures.flatfigures;

import figures.TwoDimFigure;

public class Rectangle extends TwoDimFigure {

    public double width;

    public Rectangle(double width, double length) {
        super(length);
        this.width = width;
    }

    @Override
    public double getSquare() {
        return length * width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
