package mastermind.views.prototype;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.Session;
import mastermind.views.View;

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

    public View getView(Session session) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(session.getViewType()).getView(session.getValueState());
    }
}