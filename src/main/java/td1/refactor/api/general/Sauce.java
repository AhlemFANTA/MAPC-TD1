package td1.refactor.api.general;

public class Sauce implements FoodProduct {

    public static enum SauceType {
        BURGER, BARBECUE, BEARNAISE;
        
        public double caloriesPer100g() {
            double rtr;
            switch(this) {
                case BURGER:
                    rtr = 240;
                    break;
                case BARBECUE:
                    rtr = 130;
                    break;
                default:
                rtr = 550;
            }
            return rtr;
        }
    }

    private static double BASE_PRICE = 1;
    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override 
    public double caloriesPer100g() {
        return this.type.caloriesPer100g();
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}
