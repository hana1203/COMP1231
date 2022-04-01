package inheritance;

public class FoodAnalyzer {
    public static void main(String[] args) {
        FoodPizza pizza = new FoodPizza(275);
        System.out.println("Calories per serving: "+pizza.caloriesPerServing());
        //275fatGrams * 9CALORIES_PER_GRAM /8servings = 309
    }

}
