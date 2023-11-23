/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Prototype.Shape;

/**
 *
 * @author fa20-bse-018
 */
class Human extends Shape {

    public Human() {
        type = "Human";
    }

    @Override
    public void draw() {
        System.out.println("Inside Human::draw() method.");
    }
}
