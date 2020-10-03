package td1.refactor.api.general;

public interface FoodProduct extends Product, FoodConsituent{
    default double calories() {
        return weight() * caloriesPer100g() / 100;
    }
}
