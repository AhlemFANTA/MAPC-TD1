package td1.refactor.api.general;

public class Meat implements FoodProduct {
    public enum MeatType {
        BEEF, WHITEFISH;
        
        public double price() {
            double rtr;
            switch (this) {
                case WHITEFISH:
                    rtr = 6;
                    break;
                case BEEF:
                default:
                    rtr = 4;
            }
            return rtr;
        }

        public double caloriesPer100g() {
            double rtr;
            switch(this) {
                case WHITEFISH:
                    rtr = 170;
                    break;
                case BEEF:
                default:
                rtr = 200;
            }
            return rtr;
        }
    }

    public enum MeatSize {
        LITTLE, MEDIUM, BIG
    }

    private MeatType type;
    private double weight;

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
