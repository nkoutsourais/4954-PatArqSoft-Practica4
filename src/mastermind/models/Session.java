package mastermind.models;

public class Session {

    private Game game;

    private State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
    }

    public void resume() {
        this.game.clear();
        this.state.reset();
    }

    public void next() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public Game getGame() {
        return this.game;
    }

    public void addProposedCombination(ProposedCombination combination) {
        this.game.addCombination(combination);
        if (this.game.isFinished())
            this.state.next();
    }
}