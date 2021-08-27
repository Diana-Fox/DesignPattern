package command.order;

import java.util.ArrayList;

public class MenuCommand implements Command {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command :
                commands) {
            command.execute();
        }
    }
}
