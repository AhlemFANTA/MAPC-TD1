package td1.refactor.api.general;

import td1.refactor.api.general.Restaurant.RestaurantType;

public class RestaurantFactory {
    public Restaurant selectRestaurant(RestaurantType type) {
        Restaurant rtr = null;
        if (type == RestaurantType.CHEAP) {
            rtr = new CheapRestaurant();
        } else if (type == RestaurantType.EXPENSIVE) {
            rtr = new ExpensiveRestaurant();
        } else {
            System.out.println("Wrong restaurant type.");
        }
        return rtr;
    }
}
