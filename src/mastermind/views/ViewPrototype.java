package mastermind.views;

import java.util.HashMap;
import java.util.Map;

import mastermind.views.console.*;

public class ViewPrototype {

    private Map<ViewGameType, View> viewsMap = new HashMap<>();

    private static ViewPrototype viewPrototype;

    public static ViewPrototype getInstance(ViewType viewType) {
        if (viewPrototype == null) {
            viewPrototype = new ViewPrototype(viewType);
        }
        return viewPrototype;
    }

    private ViewPrototype(ViewType viewType) {
        switch (viewType) {
            case GRAPHIC:
                this.viewsMap.putAll(getGraphicViews());
            default:
                this.viewsMap.putAll(getConsoleViews());
        }
    }

    private Map<ViewGameType, View> getConsoleViews() {
        Map<ViewGameType, View> viewsConsoleMap = new HashMap<>();
        viewsConsoleMap.put(ViewGameType.START, new StartConsoleView());
        viewsConsoleMap.put(ViewGameType.GAME, new GameConsoleView());
        viewsConsoleMap.put(ViewGameType.RESUME, new ResumeConsoleView());
        return viewsConsoleMap;
    }

    private Map<ViewGameType, View> getGraphicViews() {
        Map<ViewGameType, View> viewsGraphicMap = new HashMap<>();
        return viewsGraphicMap;
    }

    public View getView(ViewGameType viewGameType) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(viewGameType).clone();
    }
}