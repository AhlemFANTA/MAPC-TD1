package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

class CheapRestaurant implements Restaurant {
    @Override
    public BurgerBuilder orderMenu(Menus menuType) {
        BurgerBuilder rtr = null;
        switch(menuType) {
                    case MEAT:
                        rtr = new CheapBurgerBuilder("Beefy", MeatType.BEEF, MeatSize.MEDIUM)
                            .withSauce(SauceType.BURGER)
                            .withCheese();
                        break;
                    case FISH:
                        rtr = new CheapBurgerBuilder("Fishy", MeatType.WHITEFISH, MeatSize.LITTLE)
                            .withSauce(SauceType.BEARNAISE);
                        break;
                    case CHEESE:
                        rtr = new CheapBurgerBuilder("Cheesy", MeatType.BEEF, MeatSize.MEDIUM)
                            .withCheese();
                        break;
                    case CUSTOM:
                        break;
                    default :
                        System.out.println("Custom menus must be ordered separately");
                }
        return rtr;
    }

    @Override 
    public BurgerBuilder orderPersonal(String name, MeatType type, MeatSize size) {
        return new CheapBurgerBuilder(name, type, size);
    }
}