package foodtype.food;

import foodtype.FoodType;

public class Fish extends Food {
    public Fish(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FISH;
    }


}