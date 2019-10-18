package mastermind.controllers;

import mastermind.models.*;

public abstract class Controller {
    
    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public abstract void control();
}