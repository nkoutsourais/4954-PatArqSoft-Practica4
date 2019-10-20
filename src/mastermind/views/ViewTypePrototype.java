package mastermind.views;

interface ViewTypePrototype {
    View getView(ViewGameType viewGameType) throws CloneNotSupportedException;
}