package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposeCombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.StateValue;
import mastermind.views.ViewType;

public class Mastermind {

    private Session session;

    private Map<StateValue, Controller> controllers;

    Mastermind(ViewType viewType) {
        this.session = new Session(viewType);
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, new ProposeCombinationController(this.session));
        this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    Controller getController() {
        return this.controllers.get(this.session.getValueState());
    }

    void play() throws CloneNotSupportedException {
        Controller controller;
        do {
            controller = this.getController();
            if (controller != null)
                controller.control();
        } while (controller != null);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ViewType viewType = ViewType.CONSOLE;
        if (args.length > 0 && args[0] != null)
            viewType = ViewType.parser(args[0]);
        new Mastermind(viewType).play();
    }
}