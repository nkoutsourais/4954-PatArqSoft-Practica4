package mastermind.views;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;

public interface GameView extends View {

    void writeGame(Game game);

    ProposedCombination read();
}