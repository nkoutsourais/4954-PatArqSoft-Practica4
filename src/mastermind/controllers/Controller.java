package mastermind.controllers;

import mastermind.models.*;
import mastermind.views.ViewPrototype;

public abstract class Controller {
    
    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    protected ViewPrototype getViewPrototype() {
        return ViewPrototype.getInstance(this.session.getViewType());
    }

    public abstract void control() throws CloneNotSupportedException;
}