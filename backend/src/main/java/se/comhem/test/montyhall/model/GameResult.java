package se.comhem.test.montyhall.model;

public class GameResult {

    private boolean win;
    private boolean changedDoor;
    private Game game;

    public GameResult(boolean win, boolean changedDoor, Game game) {
        this.win = win;
        this.changedDoor = changedDoor;
        this.game = game;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isChangedDoor() {
        return changedDoor;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "win=" + win +
                ", changedDoor=" + changedDoor +
                ", game=" + game +
                '}';
    }
}
