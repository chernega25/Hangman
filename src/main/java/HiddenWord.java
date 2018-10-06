public class HiddenWord {
    private String word;
    private boolean[] guessedLetters;
    private int wordLength;
    private int numberOfGuessedLetters;

    public HiddenWord() {
        Dictionary dictionary = new Dictionary();
        word = dictionary.getRandomWord();
        wordLength = word.length();
        guessedLetters = new boolean[wordLength];
        numberOfGuessedLetters = 0;
    }

    public boolean checkALetter(char letter) {
        boolean guessed = false;

        for (int i = 0; i < wordLength; i++) {
            if (!guessedLetters[i] && word.charAt(i) == letter) {
                guessedLetters[i] = true;
                guessed = true;
                numberOfGuessedLetters += 1;
            }
        }
        return guessed;
    }

    public String getWordMask() {
        StringBuilder wordMask = new StringBuilder();

        for (int i = 0; i < wordLength; i++) {
            if (guessedLetters[i]) {
                wordMask.append(word.charAt(i));
            } else {
                wordMask.append('*');
            }
        }
        return wordMask.toString();
    }

    public boolean isGuessed() {
        return numberOfGuessedLetters == wordLength;
    }
}
