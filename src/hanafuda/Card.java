package hanafuda;

import java.util.*;

public class Card {
    private int month;
    private int value;
    private String type;
    private ArrayList<String> combos = new ArrayList<>();
    private static Stack<Card> drawStack = new Stack<>();//tech. any collection would do
    
    private Card() {
        
    }
    
    @SuppressWarnings("empty-statement")
    public static void createDeck() {
        Card[][] deck = new Card[12][4]; //fastest way to initialize all cards
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++){
                deck[i][j] = new Card();
                deck[i][j].month = i + 1;
                deck[i][j].setValue(j);
            }
        }
        deck[0][0].toBright();
        deck[2][0].toBright();
        deck[7][0].toBright();
        deck[10][0].toBright();
        deck[10][0].combos.remove(3);
        deck[10][0].combos.remove(1);
        deck[11][0].toBright();
        deck[0][1].value = 10;
        deck[0][1].combos.remove(1);
        deck[1][1].combos.remove(1);
        deck[2][1].combos.remove(1);
        deck[3][1].combos.remove(0);
        deck[4][1].combos.remove(1);
        deck[4][1].combos.remove(0);
        deck[5][1].combos.remove(0);
        deck[6][1].combos.remove(1);
        deck[6][1].combos.remove(0);
        deck[7][1].setValue(0);
        deck[8][1].combos.remove(0);
        deck[9][1].combos.remove(0);
        deck[10][1].setValue(0);
        deck[11][1].setValue(0);
        deck[10][2].setValue(1);
        deck[10][2].combos.remove(1);
        deck[10][2].combos.remove(0);
        
        for (Card[] e: deck) {
            for (Card f: e) {
                drawStack.push(f);
            }
        }
        shuffleDeck();
    }
    
    private void setValue(int n) {
        switch(n) {
            case 3:
                value = 0;
                type = "trash";
                combos.add("\u30ab\u30b9");
                break;
            case 2:
                value = 0;
                type = "trash";
                combos.add("\u30ab\u30b9");
                break;
            case 1:
                value = 5;
                type = "ribbon";
                combos.add("\u8d64\u77ed");
                combos.add("\u9752\u77ed");
                combos.add("\u77ed");
                break;
            case 0:
                value = 10;
                type = "animal";
                combos.add("\u30bf\u30cd");
                break;
        }
    }
    
    private void toBright() {//helper method to reduce redundancy
        value = 20;
        type = "bright";
        combos.add("\u4e94\u5149");
        combos.add("\u56db\u5149");
        combos.add("\u96e8\u56db\u5149");
        combos.add("\u4e09\u5149");
    }
    
    public static void shuffleDeck() {
        Collections.shuffle(drawStack);
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return type + " card worth " + value + " points";
    }
    
    public static boolean isEmpty() {
        return drawStack.empty();
    }
    
    public static Card drawCard() {
        return drawStack.pop();
    }
}
