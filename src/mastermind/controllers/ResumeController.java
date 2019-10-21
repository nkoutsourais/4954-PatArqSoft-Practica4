package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.ResumeView;
import mastermind.views.prototype.ViewPrototype;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void control() throws CloneNotSupportedException {
        ResumeView resumeView = (ResumeView)ViewPrototype.getInstance().getView(session);
        resumeView.writeFinalResult(session.isWinner());
        if (resumeView.readNewGame()) {
            this.session.resume();
        } else {
            this.session.next();
        }
    }
}