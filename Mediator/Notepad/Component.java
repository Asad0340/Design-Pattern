/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Mediator.Notepad;

/**
 *
 * @author fa20-bse-018
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
