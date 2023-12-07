package GOF.Command.RemoteControlExample;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light oldLight = new Light();
        Light newLight = new Light();

        Command lightsOn = new LightOnCommand(oldLight);
        Command lightsOff = new LightOffCommand(oldLight);
        Command lightReplace = new LightReplaceCommand(oldLight, newLight);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();

        // replace light
        control.setCommand(lightReplace);
        control.pressButton();
    }
}
