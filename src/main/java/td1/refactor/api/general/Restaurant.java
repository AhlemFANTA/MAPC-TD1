package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Meat.MeatSize;

public interface Restaurant {
    public enum RestaurantType {
        CHEAP, EXPENSIVE
    }

    public BurgerBuilder orderMenu(Menus menuType);
    public BurgerBuilder orderPersonnal(String name, MeatType type, MeatSize size);
}