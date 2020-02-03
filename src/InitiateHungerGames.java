//@author Shivam Rastogi
public class InitiateHungerGames {
    //main class
    public static void main(String[] args) {
        GamesController game = new GamesController();
        GeneratePlayers play = new GeneratePlayers();
        game.makePlayer();
        play.startFight();

    }
}
