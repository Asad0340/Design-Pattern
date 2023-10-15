/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Template.SocialLogin;

/**
 *
 * @author fa20-bse-018
 */
public class Facebook extends Network {
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Logged into Facebook as " + this.userName);
        return true;  // Simulated successful login
    }

    @Override
    boolean sendData(Message message) {
        if (message.getNetworkType() != NetworkType.FACEBOOK) {
            System.out.println("Cannot send to Facebook. Message not targeted for Facebook.");
            return false;
        }
        // Facebook sending logic
        System.out.println("Sent a " + message.getMessageType() + " message on Facebook: " + message.getDescription());
        return true;  // Simulated successful message sending
    }

    @Override
    void logOut() {
        System.out.println("Logged out from Facebook");
    }

    @Override
    NetworkType getNetworkType() {
        return NetworkType.FACEBOOK;
    }
}
