package mastermind.controllers;

import mastermind.models.Session;
import mastermind.views.StartView;
import mastermind.views.ViewGameType;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void control() throws CloneNotSupportedException {
        StartView startview = (StartView)getViewPrototype().getView(ViewGameType.START);
        startview.writeln();
        this.session.next();
    }
}