/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Prototype.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedFish = (Shape) ShapeCache.getShape("fish");
        System.out.println("Shape : " + clonedFish.getType());

        Shape clonedFish2 = (Shape) ShapeCache.getShape("fish");
        Shape clonedHuman = (Shape) ShapeCache.getShape("human");
        
        if (clonedFish.equals(clonedFish2)) {
            System.out.println("Cloned fishes are the same");
        } else {
            System.out.println("Cloned fishes are different");
        }
        if (clonedFish.equals(clonedHuman)) {
            System.out.println("Fish and Human are the same");
        } else {
            System.out.println("Fish and Human are different");
        }
    }
}
