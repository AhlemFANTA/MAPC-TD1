package td1.refactor.api.general.dietetic;

import td1.refactor.api.general.burger.BurgerIngredients;
import td1.refactor.api.general.monetary.Product;

public interface DieteticElement extends Product, BurgerIngredients {
    default double calories() {
        return weight() * caloriesPer100g() / 100;
    }
}
