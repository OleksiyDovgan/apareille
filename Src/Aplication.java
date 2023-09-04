
import java.util.HashMap;
import java.util.Map;
public class Aplication {

    private Map<DrinkMachine, Integer> drinksInventory = new HashMap<>();
    private double totalCost = 0.0;

    public Aplication() {
        for (DrinkMachine drink : DrinkMachine.values()) {
            drinksInventory.put(drink, 0);
        }
    }



    public void makeDrink(DrinkMachine choice) {
        switch (choice) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case MINERAL_WATER:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCocaCola();
                break;
            default:
                System.out.println("Напій не доступний.");
        }
    }

    private void makeCoffee() {
        drinksInventory.put(DrinkMachine.COFFEE, drinksInventory.get(DrinkMachine.COFFEE) + 1);
        totalCost += Drinks.COFFEE_PRICE;
    }

    private void makeTea() {
        drinksInventory.put(DrinkMachine.TEA, drinksInventory.get(DrinkMachine.TEA) + 1);
        totalCost += Drinks.TEA_PRICE;
    }

    private void makeLemonade() {
        drinksInventory.put(DrinkMachine.LEMONADE, drinksInventory.get(DrinkMachine.LEMONADE) + 1);
        totalCost += Drinks.LEMONADE_PRICE;
    }

    private void makeMojito() {
        drinksInventory.put(DrinkMachine.MOJITO, drinksInventory.get(DrinkMachine.MOJITO) + 1);
        totalCost += Drinks.MOJITO_PRICE;
    }

    private void makeMineralWater() {
        drinksInventory.put(DrinkMachine.MINERAL_WATER, drinksInventory.get(DrinkMachine.MINERAL_WATER) + 1);
        totalCost += Drinks.MINERAL_WATER_PRICE;
    }

    private void makeCocaCola() {
        drinksInventory.put(DrinkMachine.COCA_COLA, drinksInventory.get(DrinkMachine.COCA_COLA) + 1);
        totalCost += Drinks.COCA_COLA_PRICE;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public static void main(String[] args) {
        Aplication drinksMachineApp = new Aplication();
        drinksMachineApp.makeDrink(DrinkMachine.COFFEE);
        drinksMachineApp.makeDrink(DrinkMachine.LEMONADE);
        drinksMachineApp.makeDrink(DrinkMachine.MOJITO);

        System.out.println("Price: $" + drinksMachineApp.getTotalCost());
    }
}



