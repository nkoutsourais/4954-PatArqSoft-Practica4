package mastermind.models;

import java.util.*;

public class Game {

    private static final int MAX_LONG = 10;

    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;

    public Game() {
        this.clear();
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
    }

    public boolean isFinished() {
        if (this.results.get(this.getAttempts() - 1).isWinner()) {
            return true;
        }
        if (this.getAttempts() == Game.MAX_LONG) {
            return true;
        }
        return false;
    }

    public int getAttempts() {
        return this.proposedCombinations.size();
    }

    public List<ProposedCombination> getProposedCombinations() {
        return proposedCombinations;
    }

    public List<Result> getResults() {
        return results;
    }

    public boolean isWinner() {
        return this.getResults().get(getAttempts() - 1).isWinner();
    }

    public void addCombination(ProposedCombination combination) {
        this.proposedCombinations.add(combination);
        Result result = secretCombination.getResult(combination);
        this.results.add(result);
    }
}