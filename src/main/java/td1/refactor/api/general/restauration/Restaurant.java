package td1.refactor.api.general.restauration;

import td1.refactor.api.general.burger.BurgerBuilder;
import td1.refactor.api.general.burger.Meat.MeatType;
import td1.refactor.api.general.burger.Meat.MeatSize;
import td1.refactor.api.general.burger.Menu;

public interface Restaurant {
    enum RestaurantType {
        CHEAP, FANCY
    }

    BurgerBuilder selectMenu(Menu menuType);
    BurgerBuilder orderPersonal(String name, MeatType type, MeatSize size);
}