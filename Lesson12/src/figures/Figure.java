package figures;

public abstract class Figure {

    protected double length;

    public Figure(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
