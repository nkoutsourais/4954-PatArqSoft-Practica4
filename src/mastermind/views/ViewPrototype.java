package mastermind.views;

import java.util.HashMap;
import java.util.Map;

public class ViewPrototype {

    private Map<ViewType, ViewTypePrototype> viewsMap = new HashMap<>();

    private static ViewPrototype viewPrototype;

    public static ViewPrototype getInstance() {
        if (viewPrototype == null) {
            viewPrototype = new ViewPrototype();
        }
        return viewPrototype;
    }

    private ViewPrototype() {
        viewsMap.put(ViewType.CONSOLE, new ViewConsolePrototype());
        viewsMap.put(ViewType.GRAPHIC, new ViewGraphicPrototype());
    }

    public View getView(ViewType viewType, ViewGameType viewGameType) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(viewType).getView(viewGameType);
    }
}