package td1.refactor.api.general.restauration;

import td1.refactor.api.general.burger.BurgerBuilder;
import td1.refactor.api.general.burger.FancyBurgerBuilder;
import td1.refactor.api.general.burger.Meat.MeatSize;
import td1.refactor.api.general.burger.Meat.MeatType;
import td1.refactor.api.general.burger.Sauce.SauceType;

public class FancyRestaurant implements Restaurant {
    @Override
    public BurgerBuilder selectMenu(Menu menuType) {
        BurgerBuilder rtr = null;
        switch (menuType) {
            case MEAT -> rtr = new FancyBurgerBuilder("BigMarcel", MeatType.BEEF, MeatSize.MEDIUM)
                    .withSauce(SauceType.BURGER)
                    .withTomato();
            case FISH -> rtr = new FancyBurgerBuilder("FiletO'Poisson", MeatType.WHITEFISH, MeatSize.MEDIUM)
                    .withSauce(SauceType.BEARNAISE);
            case CHEESE -> rtr = new FancyBurgerBuilder("MaxeeCheese", MeatType.BEEF, MeatSize.MEDIUM)
                    .withCheese()
                    .withOnion();
            default -> System.out.println("Custom menus must be ordered separately");
        }
        return rtr;
    }

    @Override
    public BurgerBuilder orderPersonal(String name, MeatType type, MeatSize size) {
        return new FancyBurgerBuilder(name, type, size);
    }
    
}
