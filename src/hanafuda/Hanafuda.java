package hanafuda;

import java.util.*;
import java.io.*;

public class Hanafuda {

    private static String language;
    
    public static void main(String[] args) throws FileNotFoundException {
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        Card.createDeck();
        while (!Card.isEmpty()) {
            System.out.println(Card.drawCard());
        }
        /*File input = new File("Settings.txt");
        File output = new File("output.txt");
        Scanner sc1 = new Scanner(input);
        PrintStream ps = new PrintStream(output);
        language = sc1.next();
        while (sc1.hasNextLine()) {
            Scanner sc2 = new Scanner(sc1.nextLine());
            while (sc2.hasNext()) {
                ps.print(sc2.next() + " ");
            }
            ps.println();
        }
        Combination.initializeCombos();
        Player p = new Player("David");
        System.out.println(Arrays.toString(p.getCombos()));*/
    }
    
}
