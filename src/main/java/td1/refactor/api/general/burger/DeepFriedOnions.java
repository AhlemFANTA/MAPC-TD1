package td1.refactor.api.general.burger;

import td1.refactor.api.general.dietetic.DieteticElement;

public class DeepFriedOnions implements DieteticElement {
    private double weight;
    private double BASE_PRICE = 1.5;

    public DeepFriedOnions(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public double caloriesPer100g() { 
        return 590; 
    }

    @Override
    public String toString() {
        return String.format("deep fried onions (%.0fg) -- %.2f€", weight(), price());
    }

}
