package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.models.Session;
import mastermind.views.GameView;
import mastermind.views.ViewGameType;
import mastermind.views.ViewPrototype;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController(Session session) {
        super(session);
    }

    @Override
    public void control() throws CloneNotSupportedException {
        GameView gameView = (GameView)ViewPrototype.getInstance().getView(session.getViewType(), ViewGameType.GAME);
        ProposedCombination proposedCombination = gameView.read();
        this.session.addProposedCombination(proposedCombination);
        gameView.writeGame(this.session.getGame());
    }
}