package td1.refactor.api.general;

import java.util.ArrayList;
import java.util.List;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

public class CheapBurgerBuilder implements BurgerBuilder {
    private final List<DieteticElement> products;
    private final String name;

    public CheapBurgerBuilder(String name, MeatType type, MeatSize size) {
        this.name = name;
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, this.getMeatWeight(type, size)));
    }

    @Override
    public double cheesePortion() {
        return 10;
    }

    @Override
    public double tomatoPortion() {
        return 10;
    }

    @Override
    public double onionPortion() {
        return 10;
    }

    @Override
    public double saucePortion() {
        return 40;
    }

    @Override
    public double tinyMeatPortion() {
        return 50;
    }

    @Override
    public double mediumMeatPortion() {
        return 100;
    }

    @Override
    public double bigMeatPortion() {
        return 200;
    }

    @Override
    public BurgerBuilder withOnion() {
        this.products.add(new DeepFriedOnions(this.onionPortion()));
        return this;
    }

    @Override
    public BurgerBuilder withCheese() {
        this.products.add(new Cheddar(this.cheesePortion()));
        return this;
    }

    @Override
    public BurgerBuilder withTomato()  {
        this.products.add(new Tomato(this.tomatoPortion()));
        return this;
    }

    @Override
    public BurgerBuilder withSauce(SauceType type) {
        this.products.add(new Sauce(type, this.saucePortion()));
        return this;
    }

    @Override
    public Burger cook() {
        return new Burger(this.name, this.products);
    }
}
