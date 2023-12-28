/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkgfinal;

/**
 *
 * @author Asad
 */
class NullUser extends User {
    public NullUser() {
        super("NullUser", "");
    }

    public void accessSurveys() {
        System.out.println("NullUser cannot access surveys.");
    }

    public void accessPolls() {
        System.out.println("NullUser cannot access polls.");
    }

    public void communicateDirectly() {
        System.out.println("NullUser cannot communicate directly.");
    }
}

