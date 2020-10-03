package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

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
