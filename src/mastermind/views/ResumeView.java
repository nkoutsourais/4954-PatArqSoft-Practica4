package mastermind.views;

public interface ResumeView extends View {

    boolean readNewGame();

    void writeFinalResult(Boolean isWinner);
}