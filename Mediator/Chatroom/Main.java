/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Mediator.Chatroom;

/**
 *
 * @author fa20-bse-018
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University comsatsUniversity = new University("COMSATS University");
        University nustUniversity = new University("NUST");
        Teacher teachermukhtiar = new Teacher("Sir Mukhtiar Zamin ");
        User hamza = new User("Hamza");
        User atif = new User("Atif");
   
        ChatRoom.sendMessageToTarget(hamza, comsatsUniversity, "Hello, COMSATS University!");
        ChatRoom.sendMessageToAll(hamza, List.of(comsatsUniversity, nustUniversity, teachermukhtiar, atif), "Hello, Everyone!");
    }

}