package hanafuda;

import java.util.*;

public class Player{
    private String name;
    private Combination[] currentCombos;
    private int gamesWon;
    private int highScore;
    
    public Player(String name) {
        this.name = name;
        currentCombos = Combination.resetCombos();
    }
    
    public Player(String name, int games, int score) {
        this.name = name;
        currentCombos = Combination.resetCombos();
        gamesWon = games;
        highScore = score;
    }
    
    public Combination[] getCombos() {
        return currentCombos;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGamesWon() {
        return gamesWon;
    }
    
    public int getHighScore() {
        return highScore;
    }
    
    @Override
    public String toString() {
        return String.format("%s %d %d", name, gamesWon, highScore);
    }
}

class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p2.getHighScore() - p1.getHighScore();
    }
}
