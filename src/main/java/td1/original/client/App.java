package td1.original.client;

import td1.original.api.general.*;
import static td1.original.api.general.Meat.MeatType.*;
import static td1.original.api.general.Sauce.SauceType.*;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Burger aliceDinner = new Burger(
                "Fishy",
                List.of(new Meat(WHITEFISH, 50),
                        new Sauce(BEARNAISE, 40))
        );
        Burger bobDinner = new Burger(
                "Beefy",
                List.of(new Meat(BEEF, 100),
                        new Sauce(BURGER, 40),
                        new DeepFriedOnions(10),
                        new Cheddar(15),
                        new DeepFriedOnions(10),
                        new Cheddar(15))
        );
        Burger charlesDinner = new Burger(
                "Own Style",
                List.of(new Meat(BEEF,400),
                        new DeepFriedOnions(20),
                        new Cheddar(30),
                        new Sauce(BARBECUE,20),
                        new Sauce(BEARNAISE,20),
                        new Sauce(BURGER,20),
                        new Cheddar(30))
        );
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
