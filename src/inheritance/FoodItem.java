package inheritance;

import java.util.concurrent.ThreadPoolExecutor;

public class FoodItem {
    final private int CALORIES_PER_GRAM = 9;
    private int fatGrams;
    protected int servings;

    public FoodItem(int fatGrams, int servings) {
        this.fatGrams = fatGrams;
        this.servings = servings;
    }

    private int calories() {
        return fatGrams * CALORIES_PER_GRAM;
    }

    public int caloriesPerServing() {
        return calories()/servings;
    }

}
