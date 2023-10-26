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
 class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }	 
      return null;
   }
@Override
   public Triangle getTriangle(String triangleType) {
      if (triangleType.equalsIgnoreCase("NORMAL")) {
         return new NormalTriangle();
      } else if (triangleType.equalsIgnoreCase("ROUNDED")) {
         return new RoundedTriangle();
      }
      return null;
   }

}
