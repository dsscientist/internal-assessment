package hanafuda;


public class Player {
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
    
    public void setGame(int i) {
        gamesWon += i;
    }
    
    @Override
    public String toString() {
        return String.format("@s @d @d", name, gamesWon, highScore);
    }
}
