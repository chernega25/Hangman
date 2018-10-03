import java.io.InputStream;

public class Game {
    private int maxNumberOfMistakes;
    private int numberOfMistakes;
    private HiddenWord hiddenWord;
    private ConsoleCommunication consoleCommunication;

    private Game(int maxNumberOfMistakes, InputStream inputStream) {
        this.maxNumberOfMistakes = maxNumberOfMistakes;
        this.numberOfMistakes = 0;
        hiddenWord = new HiddenWord();
        consoleCommunication = new ConsoleCommunication(inputStream);
    }

    public static Game startAGame(int maxNumberOfMistakes, InputStream inputStream) {
        return new Game(maxNumberOfMistakes, inputStream);
    }

    public void round() {
        char letter = consoleCommunication.guessALetter();
        if (hiddenWord.checkALetter(letter)) {
            consoleCommunication.hit();
        }
        else {
            consoleCommunication.missed(++numberOfMistakes, maxNumberOfMistakes);
        }
        consoleCommunication.word(hiddenWord.getWordMask());
    }

    public boolean isEnd() {
        return hiddenWord.isGuessed() || numberOfMistakes == maxNumberOfMistakes;
    }

    public void gameOver() {
        if (hiddenWord.isGuessed()) {
            consoleCommunication.win();
        }
        if (numberOfMistakes == maxNumberOfMistakes) {
            consoleCommunication.lose();
        }
    }
}
