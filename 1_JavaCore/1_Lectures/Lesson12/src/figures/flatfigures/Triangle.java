package figures.flatfigures;

import figures.TwoDimFigure;

public class Triangle extends TwoDimFigure {

    public double high;

    public Triangle(double length, double high) {
        super(length);
        this.high = high;
    }

    @Override
    public double getSquare() {
        return (length * high) / 2;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }
}
