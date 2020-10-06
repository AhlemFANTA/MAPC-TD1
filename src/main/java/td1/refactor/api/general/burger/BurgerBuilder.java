package td1.refactor.api.general.burger;

import td1.refactor.api.general.burger.Meat.MeatSize;
import td1.refactor.api.general.burger.Meat.MeatType;
import td1.refactor.api.general.burger.Sauce.SauceType;

public interface BurgerBuilder {
    double tinyMeatPortion();

    double mediumMeatPortion();

    double bigMeatPortion();

    double cheesePortion();

    double onionPortion();

    double saucePortion();

    double tomatoPortion();

    BurgerBuilder withOnion();

    BurgerBuilder withCheese();

    BurgerBuilder withSauce(SauceType type);

    BurgerBuilder withTomato();

    Burger cook();

    default double getMeatWeight(MeatType type, MeatSize size) {
        return switch (size) {
            case TINY -> this.tinyMeatPortion();
            case MEDIUM -> this.mediumMeatPortion();
            default -> this.bigMeatPortion();
        };
    }
}
