package foodtype.food;

import foodtype.FoodType;

public class Vegetable extends Food {
    public Vegetable(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }
}