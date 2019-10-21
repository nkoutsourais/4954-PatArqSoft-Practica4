package mastermind.views.prototype;

import mastermind.models.StateValue;
import mastermind.views.View;

interface ViewTypePrototype {
    View getView(StateValue stateValue) throws CloneNotSupportedException;
}