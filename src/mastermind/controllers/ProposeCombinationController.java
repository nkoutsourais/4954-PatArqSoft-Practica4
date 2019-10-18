package mastermind.controllers;

import mastermind.models.*;
import mastermind.views.console.GameView;
import mastermind.views.console.ProposedCombinationView;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ProposedCombination proposedCombination = new ProposedCombinationView().read();
        this.session.addProposedCombination(proposedCombination);
        new GameView().writeGame(this.session.getGame());
    }
}