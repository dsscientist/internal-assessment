package hanafuda;

import java.util.*;

public class Hanafuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HomeScreen hs = new HomeScreen();
        //hs.setVisible(true);
        Card.createDeck();
        while (!Card.isEmpty()) {
            System.out.println(Card.drawCard());
        }
    }
    
}
