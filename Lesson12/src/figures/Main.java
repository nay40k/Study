/*
Реализовать иерархию геометрических фигур
Двумерные и трехмерные фигуры.
Предусмотреть возможность инициализации полей через конструктор и через сеттеры.
Для двумерных добавить метод получения площади, для трехмерных объема.
*/

package figures;

import figures.flatfigures.Rectangle;
import figures.flatfigures.Triangle;
import figures.volumetricfigures.Cube;

public class Main {
    public static void main(String[] args) {

        Rectangle georg = new Rectangle(15,12.35);
        System.out.println(georg.getSquare());

        Triangle mary = new Triangle(12, 19);
        System.out.println(mary.getSquare());

        Cube michael = new Cube(3.5);
        System.out.println(michael.getVolume());

    }
}
