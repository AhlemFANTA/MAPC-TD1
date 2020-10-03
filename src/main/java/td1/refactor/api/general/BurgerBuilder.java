package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

public interface BurgerBuilder {
    double littleMeatPortion();

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
            case LITTLE -> this.littleMeatPortion();
            case MEDIUM -> this.mediumMeatPortion();
            default -> this.bigMeatPortion();
        };
    }
}
