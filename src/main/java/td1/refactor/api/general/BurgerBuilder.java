package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

public interface BurgerBuilder {
    public double littleMeatPortion();
    public double mediumMeatPortion();
    public double bigMeatPortion();
    public double cheesePortion();
    public double onionPortion();
    public double saucePortion();
    public double tomatoPortion();

    public BurgerBuilder withOnion();
    public BurgerBuilder withCheese();
    public BurgerBuilder withSauce(SauceType type);
    public BurgerBuilder withTomato();
    
    public Burger cook();

    public default double getMeatWeight(MeatType type, MeatSize size) {
        double weight;
        switch(size) {
            case LITTLE:
                weight = this.littleMeatPortion();
                break;
            case MEDIUM:
                weight = this.mediumMeatPortion();
                break;
            case BIG:
            default:
                weight = this.bigMeatPortion();
        }
        return weight;
    }
}
