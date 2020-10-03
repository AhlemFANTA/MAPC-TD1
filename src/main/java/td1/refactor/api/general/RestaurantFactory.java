package td1.refactor.api.general;

import td1.refactor.api.general.Restaurant.RestaurantType;

public class RestaurantFactory {
    public Restaurant selectRestaurant(RestaurantType type) {
        Restaurant rtr = null;
        if (type.equals(RestaurantType.CHEAP)) {
            rtr = new CheapRestaurant();
        } else if (type.equals(RestaurantType.FANCY)) {
            rtr = new FancyRestaurant();
        } else {
            System.out.println("Must choose a type of restaurant!");
        }
        return rtr;
    }
}
