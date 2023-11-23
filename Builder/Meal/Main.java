/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Builder.Meal;

/**
 *
 * @author fa20-bse-018
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = new Meal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Meal Builder!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Prepare Veg Meal");
            System.out.println("2. Prepare Non-Veg Meal");
            System.out.println("3. Prepare Diet Meal");
            System.out.println("4. Prepare Tea");
            System.out.println("5. Show Meal and Total Cost");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    meal = mealBuilder.prepareVegMeal();
                    break;
                case 2:
                    meal = mealBuilder.prepareNonVegMeal();
                    break;
                case 3:
                    meal = mealBuilder.prepareDietMeal();
                    break;
                case 4:
                    meal = mealBuilder.prepareTeaMeal();
                    break;
                case 5:
                    System.out.println("Meal Details:");
                    meal.showItems();
                    System.out.println("Total Cost: " + meal.getCost());
                    break;
                case 6:
                    System.out.println("Thank you for using the Meal Builder. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}