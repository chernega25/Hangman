public class Main {
    public static void main(String[] args) {
        Game game = Game.startAGame(5, System.in);
        while (!game.isEnd()) {
            game.round();
        }
        game.gameOver();
    }
}
