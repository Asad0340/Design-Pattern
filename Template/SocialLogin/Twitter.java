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
public class Twitter extends Network {
    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Logged into Twitter as " + this.userName);
        return true;  // Simulated successful login
    }

    @Override
    boolean sendData(Message message) {
        if (message.getNetworkType() != NetworkType.TWITTER) {
            System.out.println("Cannot send to Twitter. Message not targeted for Twitter.");
            return false;
        }
        // Twitter sending logic
        System.out.println("Sent a " + message.getMessageType() + " message on Twitter: " + message.getDescription());
        return true;  // Simulated successful message sending
    }

    @Override
    void logOut() {
        System.out.println("Logged out from Twitter");
    }

    @Override
    NetworkType getNetworkType() {
        return NetworkType.TWITTER;
    }
}




