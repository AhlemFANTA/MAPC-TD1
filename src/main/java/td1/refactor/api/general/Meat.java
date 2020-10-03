package td1.refactor.api.general;

public class Meat implements FoodProduct {
    public enum MeatType {
        BEEF, WHITEFISH;

        public double price() {
            double rtr;
            if (this == MeatType.WHITEFISH) {
                rtr = 6;
            } else {
                rtr = 4;
            }
            return rtr;
        }

        public double caloriesPer100g() {
            if (this == MeatType.WHITEFISH) {
                return 170;
            }
            return 200;
        }
    }

    public enum MeatSize {
        TINY, MEDIUM, BIG
    }

    private final MeatType type;
    private final double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
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
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
