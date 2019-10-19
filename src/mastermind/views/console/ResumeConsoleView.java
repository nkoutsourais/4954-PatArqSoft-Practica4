package mastermind.views.console;

import mastermind.utils.WithConsoleModel;
import mastermind.utils.YesNoDialog;
import mastermind.views.Message;
import mastermind.views.ResumeView;

public class ResumeConsoleView  extends WithConsoleModel implements ResumeView {

    public boolean readNewGame() {
        return new YesNoDialog().read(Message.RESUME.getMessage());
    }

    public void writeFinalResult(Boolean isWinner) {
        if(isWinner)
            this.console.writeln(Message.WINNER.getMessage());
        else
            this.console.writeln(Message.LOOSER.getMessage());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}