package td1.refactor.api.general.burger;

import td1.refactor.api.general.dietetic.DieteticElement;
import td1.refactor.api.general.monetary.Product;

import java.util.List;

public class Burger implements DieteticElement {
    String name;
    List<DieteticElement> items;

    public Burger(String name, List<DieteticElement> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return items.stream().map(DieteticElement::calories).reduce(0.0, Double::sum);
    }

    @Override
    public double caloriesPer100g() {
        return 100 * calories() /  weight() ;
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(String.format("calories:      %.0f\n", calories()));
        buffer.append(String.format("calories/100g  %.0f\n", caloriesPer100g()));
        buffer.append(DELIM);
        return buffer.toString();
    }
}
