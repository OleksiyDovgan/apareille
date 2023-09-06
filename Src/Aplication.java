
import java.util.Map;

import java.util.Scanner;
public class Aplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinService drinksMachineApp = new DrinService();

        while (true) {
            System.out.println("Drink Menu:");
            drinksMachineApp.drinksMachineMenu();
            System.out.print("Type 7 to complete the order: ");

//            int choice = scanner.nextInt();
            String choice = scanner.nextLine();

            if (choice.equals("7")) {
                break;
            }

            if (choice.matches("\\d") && Integer.parseInt(choice) >= 1 && Integer.parseInt(choice) <= 6) {
                DrinkMachine selectedDrink = DrinkMachine.values()[Integer.parseInt(choice) - 1];
                drinksMachineApp.makeDrink(selectedDrink);
                System.out.println(selectedDrink + " added to the order.");
            } else {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("Your order:");
        for (Map.Entry<DrinkMachine, Integer> entry : drinksMachineApp.getOrderedDrinks().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units.");
        }
        System.out.println("Total cost: $" + drinksMachineApp.getTotalCost());
    }
}



