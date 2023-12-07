/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Command.RemoteControlExample;

public class LightReplaceCommand implements Command {
    private Light oldLight;
    private Light newLight;

    public LightReplaceCommand(Light oldLight, Light newLight) {
        this.oldLight = oldLight;
        this.newLight = newLight;
    }

    public void execute() {
        oldLight.switchOff();
        System.out.println("Old light is off");

        // Replace the light
        System.out.println("Replacing the light...");
        oldLight = newLight;

        oldLight.switchOn();
        System.out.println("New light is on");
    }
}

