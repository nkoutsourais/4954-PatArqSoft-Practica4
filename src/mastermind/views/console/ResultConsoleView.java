package mastermind.views.console;

import mastermind.models.Result;
import mastermind.utils.WithConsoleModel;
import mastermind.views.Message;

class ResultConsoleView extends WithConsoleModel {

    void writeln(Result result) {
        this.console.writeln(Message.RESULT.getMessage().replaceFirst("#blacks", "" + result.getBlacks())
                .replaceFirst("#whites", "" + result.getWhites()));
    }
}