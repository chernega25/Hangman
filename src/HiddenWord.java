public class HiddenWord {
    private String word;
    private boolean[] guessedLetters;
    private int wordLength;

    public HiddenWord() {
        word = "hangman";
        wordLength = word.length();
        guessedLetters = new boolean[wordLength];
    }

    public boolean checkALetter(char letter) {
        boolean guessed = false;

        for (int i = 0; i < wordLength; i++) {
            if (!guessedLetters[i] && word.charAt(i) == letter) {
                guessedLetters[i] = true;
                guessed = true;
            }
        }
        return guessed;
    }

    public String getWordMask() {
        StringBuilder wordMask = new StringBuilder();

        for (int i = 0; i < wordLength; i++) {
            if (guessedLetters[i]) {
                wordMask = wordMask.append(word.charAt(i));
            }
            else {
                wordMask = wordMask.append('*');
            }
        }
        return wordMask.toString();
    }
}
