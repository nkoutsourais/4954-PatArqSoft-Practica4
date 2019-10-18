package mastermind.views.console;

import mastermind.models.Result;
import mastermind.utils.WithConsoleModel;

public class ResultView extends WithConsoleModel {

    public void writeln(Result result) {
        this.console.writeln(Message.RESULT.getMessage().replaceFirst("#blacks", "" + result.getBlacks())
                .replaceFirst("#whites", "" + result.getWhites()));
    }
}