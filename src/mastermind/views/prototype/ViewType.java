package mastermind.views.prototype;

public enum ViewType {
    CONSOLE, GRAPHIC;

    public static ViewType parser(String string) {
        for (ViewType vType : ViewType.values()) {
            if (vType.name().equalsIgnoreCase(string)) {
                return vType;
            }
        }
        return ViewType.CONSOLE;
    }
}