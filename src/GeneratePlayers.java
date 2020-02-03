//@author Shivam Rastogi
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeneratePlayers {
    // random number generator
    Random random = new Random();
    //int datatype to calculate the average strength of a player
    int calculateAvgStrength;
    ArrayList<Integer> values = new ArrayList<>();
    int player, attackLevel, defenceLevel, healthLevel, chance;

    public void players(int player, int attackLevel, int defenceLevel, int healthLevel, int chance) {

        this.player = player;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
        this.healthLevel = healthLevel;
        this.chance = chance;

        //calculating average based on attackLevel, attackLevel, healthLevel, chance
        calculateAvgStrength = (this.attackLevel + this.attackLevel + this.healthLevel + this.chance) / 4;
        //add all average strengths of all players in arraylist values
        values.add(calculateAvgStrength);
        System.out.println("player number " + player + " with Average Strength " + calculateAvgStrength);
    }

    public void startFight() {
        for (int i = 0; i < 24; i++) {
            //while loop to abort the method of values.size is less than 1
            while (values.size() > 1) {
                // randomly assign player1Strength a strength of a player
                int player1Strength = values.get(random.nextInt(values.size()));
                //link the player1ID with its strength
                int player1ID = values.indexOf(player1Strength) + 1;
                System.out.println("player " + player1ID + " ready to fight and has average strength of " + player1Strength);

                // randomly assign player2Strength a strength of a player
                int player2Strength = values.get(random.nextInt(values.size()));
                //link the player2ID with its strength
                int player2ID = values.indexOf(player2Strength) + 1;
                System.out.println("player " + player2ID + " ready to fight and has average strength of " + player2Strength);

                //check the strength of both player, one with more strength wins and the other is removed from the
                //values arrayList
                if (player1Strength > player2Strength) {
                    System.out.println("Player " + player1ID + " won against " + player2ID);
                    values.remove(player2ID - 1);
                    System.out.println("\nremaining players\n" + values.size());
                } else if (player2Strength > player1Strength) {
                    System.out.println("Player " + player2ID + " won against " + player1ID);
                    values.remove(player1ID - 1);
                    System.out.println("\nremaining players\n" + values.size());
                } else {
                    //if average strength of two player is same then shuffle the two players in a arraylist
                    //and pick the one which has a array index of 0.
                    ArrayList<Integer> numbers = new ArrayList<Integer>();
                    numbers.add(player1Strength);
                    numbers.add(player2Strength);
                    Collections.shuffle(numbers);

                    numbers.get(0);
                    if (numbers.get(0) == player1Strength) {
                        values.remove(player2ID - 1);
                        System.out.println("player " + player1ID + " won against" + player2ID);
                        System.out.println("\nremaining players\n" + values.size());
                    } else {
                        values.remove(player1ID - 1);
                        System.out.println("player " + player2ID + " won against" + player1ID);
                        System.out.println("remaining players" + values.size());
                    }
                }
            }
        }
    }
}
