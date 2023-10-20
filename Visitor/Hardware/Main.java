/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Visitor.Hardware;

/**
 *
 * @author fa20-bse-018
 */
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        
        ComputerPartMaintainanceVisitor maintainer = new ComputerPartMaintainanceVisitor();
        
        Monitor monitor = new Monitor();
        
        maintainer.maintain(monitor);
        
    }
}