package mastermind.views.console;

import mastermind.utils.WithConsoleModel;

public class AttemptView extends WithConsoleModel {

    public void writeln(int attemps) {
        this.console.writeln(Message.ATTEMPTS.getMessage().replaceAll("#attempts", "" + attemps));
    }
}