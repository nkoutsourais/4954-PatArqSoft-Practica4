package mastermind.views.console;

import mastermind.utils.WithConsoleModel;
import mastermind.views.Message;
import mastermind.views.StartView;

public class StartConsoleView extends WithConsoleModel implements StartView {

    public void writeln() {
        this.console.writeln(Message.TITLE.getMessage());
        new SecretCombinationConsoleView().writeSecretCombination();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}