package mastermind.views.console;

public class StarView {

    public void writeln() {
        new GameView().writeTitle();
        new SecretCombinationView().writeSecretCombination();
    }
}