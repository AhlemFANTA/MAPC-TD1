package td1.refactor.api.general.burger;

import td1.refactor.api.general.burger.Meat.MeatSize;
import td1.refactor.api.general.burger.Meat.MeatType;
import td1.refactor.api.general.burger.Sauce.SauceType;
import td1.refactor.api.general.dietetic.DieteticElement;

import java.util.ArrayList;
import java.util.List;

public class FancyBurgerBuilder implements BurgerBuilder {
    private final List<DieteticElement> products;
    private final String name;

    public FancyBurgerBuilder(String name, MeatType type, MeatSize size) {
        this.name = name;
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, this.getMeatWeight(type, size)));
    }

    @Override
    public double cheesePortion() {
        return 30;
    }

    @Override
    public double tomatoPortion() {
        return 10;
    }

    @Override
    public double onionPortion() {
        return 20;
    }

    @Override
    public double saucePortion() {
        return 20;
    }

    @Override
    public double tinyMeatPortion() {
        return 100;
    }

    @Override
    public double mediumMeatPortion() {
        return 200;
    }

    @Override
    public double bigMeatPortion() {
        return 400;
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