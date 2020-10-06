package td1.refactor.api.general.burger;

import td1.refactor.api.general.dietetic.DieteticElement;

public class Tomato implements DieteticElement {
    private final double weight;
    private double BASE_PRICE = 0.5;

    public Tomato(double weight) {
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
        return 21;
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }
}