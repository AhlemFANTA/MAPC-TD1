package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

class CheapRestaurant implements Restaurant {
    @Override
    public BurgerBuilder selectMenu(Menu menuType) {
        BurgerBuilder rtr = null;
        switch(menuType) {
                    case MEAT:
                        rtr = new CheapBurgerBuilder("Beefy", MeatType.BEEF, MeatSize.MEDIUM)
                            .withSauce(SauceType.BURGER)
                            .withOnion()
                            .withCheese();
                        break;
                    case FISH:
                        rtr = new CheapBurgerBuilder("Fishy", MeatType.WHITEFISH, MeatSize.TINY)
                            .withSauce(SauceType.BEARNAISE);
                        break;
                    case CHEESE:
                        rtr = new CheapBurgerBuilder("Cheesy", MeatType.BEEF, MeatSize.TINY)
                            .withCheese();
                        break;
                    case CUSTOM:
                        break;
                    default :
                        System.out.println("Custom your menu with your style");
                }
        return rtr;
    }

    @Override 
    public BurgerBuilder orderPersonal(String name, MeatType type, MeatSize size) {
        return new CheapBurgerBuilder(name, type, size);
    }
}