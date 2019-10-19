package mastermind.controllers;

import mastermind.models.*;
import mastermind.views.GameView;
import mastermind.views.ViewGameType;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController(Session session) {
        super(session);
    }

    @Override
    public void control() throws CloneNotSupportedException {
        GameView gameView = (GameView)getViewPrototype().getView(ViewGameType.GAME);
        ProposedCombination proposedCombination = gameView.read();
        this.session.addProposedCombination(proposedCombination);
        gameView.writeGame(this.session.getGame());
    }
}