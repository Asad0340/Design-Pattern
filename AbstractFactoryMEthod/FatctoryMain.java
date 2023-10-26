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
public class FatctoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // get an object of Shape Rectangle
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    // call draw method of Shape Rectangle
    shape1.draw();

    // get an object of Shape Square
    Shape shape2 = shapeFactory.getShape("SQUARE");
    // call draw method of Shape Square
    shape2.draw();

    // get an object of Shape Triangle
    Triangle triangle = shapeFactory.getTriangle("NORMAL");
    // call draw method of Shape Triangle
    triangle.draw();

    // get double bordered shape factory
    AbstractFactory doubleBorderedShapeFactory = FactoryProducer.getDoubleBorderedShapeFactory();

    // get an object of Shape Rectangle
    Shape shape3 = doubleBorderedShapeFactory.getShape("RECTANGLE");
    // call draw method of Shape Rectangle
    shape3.draw();

    // get an object of Shape Square
    Shape shape4 = doubleBorderedShapeFactory.getShape("SQUARE");
    // call draw method of Shape Square
    shape4.draw();

    // get an object of Shape Triangle
    NormalDoubleBorderedTriangle triangle3 = doubleBorderedShapeFactory.getShape("TRIANGLE");
    // call draw method of Shape Triangle
    triangle3.draw();
    }
    
}
