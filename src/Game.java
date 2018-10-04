public class Game {
    private int maxNumberOfMistakes;
    private int numberOfMistakes;
    private HiddenWord hiddenWord;

    private Game(int maxNumberOfMistakes) {
        this.maxNumberOfMistakes = maxNumberOfMistakes;
        this.numberOfMistakes = 0;
        hiddenWord = new HiddenWord();
    }

    public static Game startAGame(int maxNumberOfMistakes) {
        return new Game(maxNumberOfMistakes);
    }

    public String roundStart() {
        return "Guess a letter:";
    }

    public String roundCheckALetter(char letter) {
        if (hiddenWord.checkALetter(letter)) {
            return "Hit!\n";
        }
        else {
            numberOfMistakes += 1;
            return "Missed, mistake" + numberOfMistakes + " out of " + maxNumberOfMistakes + ".\n";
        }
    }

    public String roundEnd() {
        return "The word:" + hiddenWord.getWordMask() + "\n";
    }

    public boolean isEnd() {
        return hiddenWord.isGuessed() || numberOfMistakes == maxNumberOfMistakes;
    }

    public String gameOver() {
        if (hiddenWord.isGuessed()) {
            return "You won!";
        }
        if (numberOfMistakes == maxNumberOfMistakes) {
            return "You lost!";
        }
        return null;
    }
}
