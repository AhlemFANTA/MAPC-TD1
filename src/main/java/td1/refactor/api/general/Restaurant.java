package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Meat.MeatSize;

public interface Restaurant {
    enum RestaurantType {
        CHEAP, EXPENSIVE
    }

    BurgerBuilder orderMenu(Menus menuType);
    BurgerBuilder orderPersonal(String name, MeatType type, MeatSize size);
}