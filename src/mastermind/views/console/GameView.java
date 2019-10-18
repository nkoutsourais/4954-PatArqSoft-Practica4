package mastermind.views.console;

import mastermind.models.Game;
import mastermind.utils.WithConsoleModel;

public class GameView extends WithConsoleModel {

    public void writeTitle() {
        this.console.writeln(Message.TITLE.getMessage());
    }

    public void writeFinalResult(Boolean isWinner) {
        if(isWinner)
            this.console.writeln(Message.WINNER.getMessage());
        else
            this.console.writeln(Message.LOOSER.getMessage());
    }

    public void writeGame(Game game) {
        new AttemptView().writeln(game.getAttempts());
        new SecretCombinationView().writeSecretCombination();
        for (int i = 0; i < game.getAttempts(); i++) {
            new ProposedCombinationView().write(game.getProposedCombinations().get(i));
            new ResultView().writeln(game.getResults().get(i));
        }
    }
}