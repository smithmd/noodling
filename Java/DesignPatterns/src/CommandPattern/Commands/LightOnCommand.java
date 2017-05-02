package CommandPattern.Commands;

import CommandPattern.Command;
import CommandPattern.Things.Light;

/**
 * Created by msmith on 5/4/2015.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
