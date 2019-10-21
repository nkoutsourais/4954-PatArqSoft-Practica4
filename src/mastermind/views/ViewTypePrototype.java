package mastermind.views;

import mastermind.models.StateValue;

interface ViewTypePrototype {
    View getView(StateValue stateValue) throws CloneNotSupportedException;
}