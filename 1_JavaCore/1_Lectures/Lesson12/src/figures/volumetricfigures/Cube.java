package figures.volumetricfigures;

import figures.ThreeDimFigure;

public class Cube extends ThreeDimFigure {

    public Cube(double length) {
        super(length);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

}
