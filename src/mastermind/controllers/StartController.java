package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.console.StarView;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        new StarView().writeln();
        this.session.next();
    }
}