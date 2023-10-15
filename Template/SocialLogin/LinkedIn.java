/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Template.SocialLogin;

/**
 *
 * @author Hamza
 */
public class LinkedIn extends Network {
    public LinkedIn(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Logged into LinkedIn as " + this.userName);
        return true;  // Simulated successful login
    }

    @Override
    boolean sendData(Message message) {
        if (message.getNetworkType() != NetworkType.LINKEDIN) {
            System.out.println("Cannot send to LinkedIn. Message not targeted for LinkedIn.");
            return false;
        }
        // LinkedIn sending logic
        System.out.println("Sent a " + message.getMessageType() + " message on LinkedIn: " + message.getDescription());
        return true;  // Simulated successful message sending
    }

    @Override
    void logOut() {
        System.out.println("Logged out from LinkedIn");
    }

    @Override
    NetworkType getNetworkType() {
        return NetworkType.LINKEDIN;
    }
}
