package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.console.GameView;
import mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        new GameView().writeFinalResult(session.isWinner());
        if (new ResumeView().readNewGame()) {
            this.session.resume();
        } else {
            this.session.next();
        }
    }
}