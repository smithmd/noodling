package CommandPattern.Test;

import CommandPattern.Commands.GarageDoorOpenCommand;
import CommandPattern.Commands.LightOnCommand;
import CommandPattern.Things.GarageDoor;
import CommandPattern.Things.Light;
import CommandPattern.Things.SimpleRemoteControl;

/**
 * Created by msmith on 5/4/2015.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
