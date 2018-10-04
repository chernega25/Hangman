import java.util.Scanner;

public class ConsoleGame {
    public static void gameStart(int maxNumberOfMistakes) {
        Scanner scanner = new Scanner(System.in);
        Game game = Game.startAGame(maxNumberOfMistakes);

        while (!game.isEnd()) {
            System.out.println(game.roundStart());
            String text = scanner.next();
            char letter = text.charAt(0);
            System.out.println(game.roundCheckALetter(letter));
            System.out.println(game.roundEnd());
        }

        game.gameOver();
    }
}
