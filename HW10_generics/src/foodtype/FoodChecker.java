package foodtype;

import foodtype.food.Food;

class FoodChecker {
    public boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (food.getFoodType() == FoodType.MEAT || food.getFoodType() == FoodType.FISH) {
                return false;
            }
        }
        return true;
    }
}