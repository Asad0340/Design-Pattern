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
 class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
    public static AbstractFactory getDoubleBorderedShapeFactory() {
      return new DoubleBorderedShapeFactory();
   }
}