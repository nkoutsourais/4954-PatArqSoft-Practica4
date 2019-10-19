package mastermind.views.console;

import mastermind.models.SecretCombination;
import mastermind.utils.WithConsoleModel;
import mastermind.views.Message;

class SecretCombinationConsoleView extends WithConsoleModel {

    void writeSecretCombination() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            this.console.write(Message.SECRET.getMessage());
        }
        this.console.write(Message.NEW_LINE.getMessage());
    }
}