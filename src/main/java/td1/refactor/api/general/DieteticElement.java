package td1.refactor.api.general;

public interface DieteticElement extends Product, FoodIngredients {
    default double calories() {
        return weight() * caloriesPer100g() / 100;
    }
}
