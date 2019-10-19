package mastermind.views.console;

import mastermind.views.Message;
import mastermind.utils.WithConsoleModel;

class AttemptConsoleView extends WithConsoleModel {

    void writeln(int attemps) {
        this.console.writeln(Message.ATTEMPTS.getMessage().replaceAll("#attempts", "" + attemps));
    }
}