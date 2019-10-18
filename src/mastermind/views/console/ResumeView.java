package mastermind.views.console;

import mastermind.utils.YesNoDialog;

public class ResumeView {

    public boolean readNewGame() {
        return new YesNoDialog().read(Message.RESUME.getMessage());
    }
}