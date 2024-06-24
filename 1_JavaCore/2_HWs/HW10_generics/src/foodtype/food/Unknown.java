package foodtype.food;

import foodtype.FoodType;

public class Unknown extends Food {
    public Unknown(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.UNKNOWN;
    }
}