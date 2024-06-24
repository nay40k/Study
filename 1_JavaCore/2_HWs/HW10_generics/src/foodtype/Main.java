/*
Создать enum - FoodType (MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN)
 ○    Создать базовый абстрактный класс Food и в нем абстрактный метод public FoodType getFoodType();
 ○    Создать 2-3 класса наследника Food и реализовать методы get/set name, a также переопределить getFoodType
      для каждого.
 ○    Создать отдельный класс с методом проверок boolean isVegetarian(Food[] foods) в метод передается набор
      ингредиентов, на выходе true если все они вегетарианские.
*/
package foodtype;

import foodtype.food.*;

public class Main {
    public static void main(String[] args) {

        Fruit durian = new Fruit("Дуриан");
        Vegetable carrot = new Vegetable("Морковь");
        Meat venison = new Meat("Оленина");
        Fish mackerel = new Fish("Скумбрия");
        Milk cowMilk = new Milk("Коровье молоко");
        Fruit apple = new Fruit("Яблоко");
        Unknown popcorn = new Unknown("Киношный попкорн");

        apple.setName("Антоновка");
        System.out.println(apple.getName());
        System.out.println(apple.getFoodType());

        Food[] foods = new Food[] {
                popcorn, venison, apple, durian, carrot, new Fruit("Груша")
        };
        FoodChecker checker = new FoodChecker();
        System.out.printf("Блюдо вегетарианское? %s%n", (checker.isVegetarian(foods) ? "да" : "нет"));
    }
}