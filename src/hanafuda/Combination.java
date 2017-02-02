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
    
    public static void initializeCombos() {//horrible inefficient, but no choice
        scoringCombos[0] = new Combination("\u4e94\u5149", 0, 10);
        scoringCombos[1] = new Combination("\u56db\u5149", 0, 8);
        scoringCombos[2] = new Combination("\u96e8\u56db\u5149", 0, 7);
        scoringCombos[3] = new Combination("\u4e09\u5149", 0, 5);
        scoringCombos[4] = new Combination("\u4e00\u676f\u3067\u82b1\u898b", 0, 5);
        scoringCombos[5] = new Combination("\u4e00\u676f\u3067\u6708\u898b", 0, 5);
        scoringCombos[6] = new Combination("\u732a\u9e7f\u8776", 0, 5);
        scoringCombos[7] = new Combination("\u30bf\u30cd", 0, 1);
        scoringCombos[8] = new Combination("\u8d64\u77ed", 0, 5);
        scoringCombos[9] = new Combination("\u9752\u77ed", 0, 5);
        scoringCombos[10] = new Combination("\u77ed", 0, 1);
        scoringCombos[11] = new Combination("\u30ab\u30b9", 0, 1);
    }
    
    public static Combination[] resetCombos() {
        return scoringCombos;
    }
    
    @Override
    public String toString() {
        return name;
    }
}