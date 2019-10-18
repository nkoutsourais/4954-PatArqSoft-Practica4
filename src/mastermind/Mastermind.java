package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposeCombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.StateValue;

public class Mastermind {

    private Session session;

    private Map<StateValue, Controller> controllers;

    public Mastermind() {
        this.session = new Session();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, new ProposeCombinationController(this.session));
        this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.session.getValueState());
    }

    public void play() {
        Controller controller;
        do {
            controller = this.getController();
            if (controller != null)
                controller.control();
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}