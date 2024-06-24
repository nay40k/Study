package foodtype.food;

import foodtype.FoodType;

public class Milk extends Food {
    public Milk(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.MILK;
    }
}
