public class Game {
    private int maxNumberOfAttempts;
    private int numberOfAttempts;

    private Game(int maxNumberOfAttempts) {
        this.maxNumberOfAttempts = maxNumberOfAttempts;
        this.numberOfAttempts = 0;
    }

    public static Game startAGame(int maxNumberOfAttempts) {
        return new Game(maxNumberOfAttempts);
    }
}
