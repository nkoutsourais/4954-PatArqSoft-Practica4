package mastermind.views;

import java.util.HashMap;
import java.util.Map;

import mastermind.views.console.GameConsoleView;
import mastermind.views.console.ResumeConsoleView;
import mastermind.views.console.StartConsoleView;

class ViewConsolePrototype implements ViewTypePrototype {

    private Map<ViewGameType, View> viewsMap = new HashMap<>();

    ViewConsolePrototype() {
        viewsMap.put(ViewGameType.START, new StartConsoleView());
        viewsMap.put(ViewGameType.GAME, new GameConsoleView());
        viewsMap.put(ViewGameType.RESUME, new ResumeConsoleView());
    }

    public View getView(ViewGameType viewGameType) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(viewGameType).clone();
    }
}