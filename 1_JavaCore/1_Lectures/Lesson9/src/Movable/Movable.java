package Movable;

public interface Movable {

    // константа
    int DEFAULT_DISTANCE = 100;

    // абстрактный метод
    void move(int distance);

    // default метод
    default void move() {
        move(DEFAULT_DISTANCE);
    }
}
