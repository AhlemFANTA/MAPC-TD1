package td1.refactor.api.general;

import td1.refactor.api.general.Restaurant.RestaurantType;

public class RestaurantFactory {
    public Restaurant selectRestaurant(RestaurantType type) {
        Restaurant rtr = null;
        switch(type) {
            case CHEAP:
                rtr = new CheapRestaurant();
                break;
            case EXPENSIVE:
                rtr = new ExpensiveRestaurant();
                break;
            default:
                System.out.println("Wrong restaurant type.");
        }
        return rtr;
    }
}
