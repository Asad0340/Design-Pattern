/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Template.SocialLogin;

/**
 *
 * @author Hamza
 */
enum MessageType {
    ERROR, WARNING, INFO
}

enum NetworkType {
    FACEBOOK, TWITTER, LINKEDIN, NONE
}
class Message {
    private String description;
    private MessageType messageType;
    private NetworkType networkType;

    public Message(String description, MessageType messageType, NetworkType networkType) {
        this.description = description;
        this.messageType = messageType;
        this.networkType = networkType;
    }

    public String getDescription() {
        return description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public NetworkType getNetworkType() {
        return networkType;
    }
}
