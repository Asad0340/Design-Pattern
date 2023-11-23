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
public class Tea extends HotDrink implements DecoratableBeverage {
    private String sweetnessType;
    private int sweetnessAmountInSpoons;
    private boolean hasCream;

    public Tea() {
        this.sweetnessType = "None";
        this.sweetnessAmountInSpoons = 0;
        this.hasCream = false;
    }

    @Override
    public void addSweetness(String sweetnessType, int amountInSpoons) {
        this.sweetnessType = sweetnessType;
        this.sweetnessAmountInSpoons = amountInSpoons;
    }

    @Override
    public void addCream() {
        this.hasCream = true;
    }

    @Override
    public float getDecorationCost() {
        float decorationCost = sweetnessAmountInSpoons * 0.5f;
        if (hasCream) {
            decorationCost += 5.0f;
        }
        return decorationCost;
    }

    @Override
    public float price() {
        return 15.0f + getDecorationCost(); // Add decoration cost to the base price
    }

    @Override
    public String name() {
        return "Tea";
    }
}