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
    
    public Combination[] getCombos() {
        return currentCombos;
    }
    
    @Override
    public String toString() {
        return String.format("@s @d @d", name, gamesWon, highScore);
    }
}
