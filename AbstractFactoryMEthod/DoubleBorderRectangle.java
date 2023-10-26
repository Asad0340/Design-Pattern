/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABstractFactoryMethod;

/**
 *
 * @author fa20-bse-019
 */
 class DoubleBorderedRectangle extends Rectangle {
   @Override
   public void draw() {
      System.out.println("Inside DoubleBorderedRectangle::draw() method.");
      // Draw the double border here
   }
}