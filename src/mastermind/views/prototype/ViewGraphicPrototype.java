package mastermind.views.prototype;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.StateValue;
import mastermind.views.View;

class ViewGraphicPrototype implements ViewTypePrototype {

    private Map<StateValue, View> viewsMap = new HashMap<>();

    ViewGraphicPrototype() {
    }

    public View getView(StateValue stateValue) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(stateValue).clone();
    }
}