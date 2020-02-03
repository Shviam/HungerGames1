//@author Shivam Rastogi
import java.util.Random;

public class GamesController extends InitiateHungerGames {
    // random number generator
    Random random = new Random();
    GeneratePlayers player = new GeneratePlayers();
    public void makePlayer(){
        System.out.println("Generate Players\n");
        //generates 24 players with a bound of 100
        for (int i = 1; i <25; i++){
            player.players(i,random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100));
        }
        System.out.println("\nAll players are ready to fight\n");
        //used to call method startFight from class player
        player.startFight();
    }
}
