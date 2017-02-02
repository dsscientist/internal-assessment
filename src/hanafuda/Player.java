package hanafuda;


public class Player {
    private String name;
    private Combination[] currentCombos;
    
    public Player(String name) {
        this.name = name;
        currentCombos = Combination.resetCombos();
    }
    
    public Combination[] getCombos() {
        return currentCombos;
    }
}
