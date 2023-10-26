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
class NormalDoubleBorderedTriangle extends DoubleBorderedTriangle {
   @Override
   public void draw() {
      System.out.println("Inside NormalDoubleBorderedTriangle::draw() method.");
   }
}
 class DoubleBorderedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType) {
      if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new DoubleBorderedRectangle();
      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
         return new DoubleBorderedSquare();
      } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
         //return new NormalDoubleBorderedTriangle();
      }
      return null;
   }

   @Override
   public Triangle getTriangle(String triangleType) {
      if (triangleType.equalsIgnoreCase("NORMAL")) {
         return new DoubleBorderedTriangle();
      } else if (triangleType.equalsIgnoreCase("ROUNDED")) {
         return new DoubleBorderedRoundedTriangle();
      }
      return null;
   }
}