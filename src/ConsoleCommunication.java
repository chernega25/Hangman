import java.io.InputStream;
import java.util.Scanner;

public class ConsoleCommunication {
    private Scanner scanner;

    public ConsoleCommunication(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public char guessALetter() {
        System.out.println("Guess a letter:");
        String input = scanner.next();
        char letter = input.charAt(0);

        return letter;
    }

    public void hit() {
        System.out.println("Hit!\n");
    }

    public void missed(int numberOfMistakes, int maxNumberOfMistakes) {
        System.out.println("Missed, mistake " + numberOfMistakes + " out of " + maxNumberOfMistakes + ".\n");
    }

    public void win() {
        System.out.println("You won!");
    }

    public void lose() {
        System.out.println("You lost!");
    }

    public void word(String wordMask) {
        System.out.println("The word:" + wordMask + "\n");
    }

}
