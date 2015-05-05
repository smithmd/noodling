package Command;

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
