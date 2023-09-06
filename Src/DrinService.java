import java.util.HashMap;
import java.util.Map;

public class DrinService {

    private Map<DrinkMachine, Integer> orderedDrinks = new HashMap<>();

    private double totalCost;

    public void drinksMachineMenu() {

        DrinkMachine[] drinks = DrinkMachine.values();

        for (int i = 0; i < drinks.length; i++) {

            System.out.println(i + 1 + ". " + drinks[i]+" price: " + drinks[i].getPrice());

        }

    }

    public void makeDrink(DrinkMachine choice) {
        switch (choice) {
            case COFFEE:
                processeDrink(DrinkMachine.COFFEE);
                totalCost += Drinks.COFFEE_PRICE;
                break;
            case TEA:
                processeDrink(DrinkMachine.TEA);
                totalCost += Drinks.TEA_PRICE;
                break;
            case LEMONADE:
                processeDrink(DrinkMachine.LEMONADE);
                totalCost += Drinks.LEMONADE_PRICE;
                break;
            case MOJITO:
                processeDrink(DrinkMachine.MOJITO);
                totalCost += Drinks.MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                processeDrink(DrinkMachine.MINERAL_WATER);
                totalCost += Drinks.MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                processeDrink(DrinkMachine.COCA_COLA);
                totalCost += Drinks.COCA_COLA_PRICE;
                break;
            default:
                System.out.println("Drink not available.");
        }
    }

    private void processeDrink(DrinkMachine drink) {

        orderedDrinks.put(drink, orderedDrinks.getOrDefault(drink, 0) + 1);

    }


    public double getTotalCost() {
        return totalCost;
    }

    public Map<DrinkMachine, Integer> getOrderedDrinks() {
        return orderedDrinks;
    }
}
