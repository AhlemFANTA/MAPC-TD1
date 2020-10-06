package td1.refactor.api.general.client;

import td1.refactor.api.general.burger.Meat.MeatSize;
import td1.refactor.api.general.burger.Meat.MeatType;
import td1.refactor.api.general.restauration.Menu;
import td1.refactor.api.general.restauration.Restaurant.RestaurantType;
import td1.refactor.api.general.burger.Sauce.SauceType;
import td1.refactor.api.general.burger.Burger;
import td1.refactor.api.general.restauration.RestaurantFactory;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RestaurantFactory advisor = new RestaurantFactory();

        Burger aliceDinner = advisor
                .selectRestaurant(RestaurantType.CHEAP)
                .selectMenu(Menu.FISH)
                .cook();

        Burger bobDinner = advisor
                .selectRestaurant(RestaurantType.CHEAP)
                .selectMenu(Menu.MEAT)
                .withOnion()
                .withCheese()
                .cook();

        Burger charlesDinner = advisor
                .selectRestaurant(RestaurantType.FANCY)
                .orderPersonal("Own style", MeatType.BEEF, MeatSize.BIG)
                .withOnion()
                .withCheese()
                .withSauce(SauceType.BARBECUE)
                .withSauce(SauceType.BEARNAISE)
                .withSauce(SauceType.BURGER)
                .withCheese()
                .cook();

        List<Burger> dinners = Arrays.asList(
                aliceDinner,
                bobDinner,
                charlesDinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }

}
