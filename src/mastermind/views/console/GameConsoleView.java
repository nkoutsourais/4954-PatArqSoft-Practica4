package mastermind.views.console;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.views.GameView;

public class GameConsoleView implements GameView {

    public void writeGame(Game game) {
        new AttemptConsoleView().writeln(game.getAttempts());
        new SecretCombinationConsoleView().writeSecretCombination();
        for (int i = 0; i < game.getAttempts(); i++) {
            new ProposedCombinationConsoleView().write(game.getProposedCombinations().get(i));
            new ResultConsoleView().writeln(game.getResults().get(i));
        }
    }

    public ProposedCombination read() {
        return new ProposedCombinationConsoleView().read();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}