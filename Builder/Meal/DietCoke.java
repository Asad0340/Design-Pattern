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
public class DietCoke extends ColdDrink implements DietDrink {
    @Override
    public float price() {
        return 35.0f; // Adjust the price for the diet version
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}