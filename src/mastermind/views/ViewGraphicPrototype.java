package mastermind.views;

import java.util.HashMap;
import java.util.Map;

class ViewGraphicPrototype implements ViewTypePrototype {

    private Map<ViewGameType, View> viewsMap = new HashMap<>();

    ViewGraphicPrototype() {
    }

    public View getView(ViewGameType viewGameType) throws CloneNotSupportedException {
        return (View) this.viewsMap.get(viewGameType).clone();
    }
}