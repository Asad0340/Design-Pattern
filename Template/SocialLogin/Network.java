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
public abstract class Network {
    String userName;
    String password;

    Network() {}

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(Message message);
    abstract void logOut();
    abstract NetworkType getNetworkType();

    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void post(Message message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message);
            if (result) {
                System.out.println("Message sent successfully on " + this.getClass().getSimpleName());
            } else {
                System.out.println("Message sending failed on " + this.getClass().getSimpleName());
            }
        } else {
            System.out.println("Failed to log in to " + this.getClass().getSimpleName());
        }
    }
}


