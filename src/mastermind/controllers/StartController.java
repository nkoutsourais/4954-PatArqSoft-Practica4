package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.StartView;
import mastermind.views.prototype.ViewPrototype;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void control() throws CloneNotSupportedException {
        StartView startview = (StartView)ViewPrototype.getInstance().getView(session);
        startview.writeln();
        this.session.next();
    }
}