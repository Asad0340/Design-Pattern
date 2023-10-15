/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Template.SocialLogin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-018
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Network> networks = new ArrayList<>();

        System.out.println("Welcome to the Social Network Poster!");
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        while (true) {
            System.out.print("Enter message description: ");
            String description = reader.readLine();
            System.out.print("Select message type (ERROR, WARNING, INFO): ");
            String messageTypeString = reader.readLine();
            MessageType messageType = MessageType.valueOf(messageTypeString);

            System.out.print("Select network (Facebook, Twitter, LinkedIn) or 'none': ");
            String networkTypeString = reader.readLine();
            NetworkType networkType = NetworkType.NONE;
            if (!networkTypeString.equalsIgnoreCase("none")) {
                networkType = NetworkType.valueOf(networkTypeString);
            }

            Message message = new Message(description, messageType, networkType);
            for (Network network : networks) {
                if (networkType == NetworkType.NONE || network.getNetworkType() == networkType) {
                    network.post(message);
                }
            }

            System.out.print("Do you want to continue sending messages? (yes/no): ");
            String continueOption = reader.readLine();
            if (!continueOption.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}

