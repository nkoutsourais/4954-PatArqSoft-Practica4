package mastermind.views.prototype;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.StateValue;
import mastermind.views.View;
import mastermind.views.console.GameConsoleView;
import mastermind.views.console.ResumeConsoleView;
import mastermind.views.console.StartConsoleView;

class ViewConsolePrototype implements ViewTypePrototype {

    private Map<StateValue, View> viewsMap = new HashMap<>();

    ViewConsolePrototype() {
        viewsMap.put(StateValue.INITIAL, new StartConsoleView());
        viewsMap.put(StateValue.IN_GAME, new GameConsoleView());
        viewsMap.put(StateValue.FINAL, new ResumeConsoleView());
    }

    public View getView(StateValue stateValue) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(stateValue).clone();
    }
}