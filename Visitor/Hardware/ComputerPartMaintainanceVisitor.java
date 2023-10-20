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
public class ComputerPartMaintainanceVisitor implements ComputerPartMaintainer {
    @Override
    public void maintain(Computer computer) {
        System.out.println("Maintaining the computer.");
    }

    @Override
    public void maintain(Mouse mouse) {
        System.out.println("Maintaining the mouse.");
    }

    @Override
    public void maintain(Keyboard keyboard) {
        System.out.println("Maintaining the keyboard.");
    }

    @Override
    public void maintain(Monitor monitor) {
        System.out.println("Maintaining the monitor.");
    }

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Maintaining the multimedia.");
    }
}