package CommandPattern.Commands;

import CommandPattern.Command;
import CommandPattern.Things.GarageDoor;

/**
 * Created by msmith on 5/4/2015.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.up();
    }
}
