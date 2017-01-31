package hanafuda;

import java.util.*;
import java.io.*;

public class Hanafuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //HomeScreen hs = new HomeScreen();
        //hs.setVisible(true);
        //Card.createDeck();
        //while (!Card.isEmpty()) {
        //    System.out.println(Card.drawCard());
        //}
        System.out.println("\u57ce\u9593");
        File input = new File("input.txt");
        File output = new File("output.txt");
        Scanner sc1 = new Scanner(input);
        PrintStream ps = new PrintStream(output);
        while (sc1.hasNextLine()) {
            Scanner sc2 = new Scanner(sc1.nextLine());
            while (sc2.hasNext()) {
                ps.print(sc2.next() + " ");
            }
            ps.println();
        }
        ps.print("please put this in and work");
    }
    
}
