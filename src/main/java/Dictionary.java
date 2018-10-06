import java.util.Random;

public class Dictionary {
    private String[] words = {"hangman", "annotation", "attention", "player", "bucket"};

    public Dictionary() {}

    public String getRandomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}