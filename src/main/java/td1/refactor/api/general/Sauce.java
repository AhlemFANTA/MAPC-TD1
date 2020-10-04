package td1.refactor.api.general;

public class Sauce implements DieteticElement {

    public enum SauceType {
        BURGER, BARBECUE, BEARNAISE;
        
        public double caloriesPer100g() {
            return switch (this) {
                case BURGER -> 240;
                case BARBECUE -> 130;
                default -> 550;
            };
        }
    }

    private static double BASE_PRICE = 1;
    private final SauceType type;
    private final double weight;

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
