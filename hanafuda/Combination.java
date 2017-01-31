package hanafuda;

public class Combination {
    private static Combination[] scoringCombos = new Combination[12];
    //perhaps put this array into some other object (like player object?)
    private static int currentScore = 0;
    private String name;
    private int currentNum = 0;
    private final int COMBO_COMPLETE;
    private final int COMBO_VALUE;
    
    public Combination(String name, int value, int finalVal) {
        this.name = name;
        COMBO_VALUE = value;
        COMBO_COMPLETE = finalVal;
    }
    
    public static void initializeCombos() {
        
    }
}