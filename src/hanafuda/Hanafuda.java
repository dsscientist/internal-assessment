package hanafuda;

import java.util.*;
import java.io.*;

public class Hanafuda {

    private static String language;
    private static ArrayList<Player> playerList = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        Card.createDeck();
        while (!Card.isEmpty()) {
            System.out.println(Card.drawCard());
        }
        File settings = new File("Settings.txt");
        Hanafuda.getSettings(settings);
        playerList.get(0).setGame(2);
        Hanafuda.saveData(settings);
        Combination.initializeCombos();
        Player p = new Player("David");
        System.out.println(Arrays.toString(p.getCombos()));
    }
    
    public static void getSettings(File settings) throws FileNotFoundException {
        Scanner scanLine = new Scanner(settings);
        language = scanLine.nextLine();
        while (scanLine.hasNextLine()) {
            String l = scanLine.nextLine();
            Scanner scanTok = new Scanner(l);
            String name = scanTok.next();
            int gamesWon = scanTok.nextInt();
            int highScore = scanTok.nextInt();
            playerList.add(new Player(name, gamesWon, highScore));
        }
    }
    
    public static void saveData(File settings) throws FileNotFoundException{
        PrintStream ps = new PrintStream(settings);
        ps.println(language);
        for (Player p: playerList) {
            ps.println(p);
        }
    }
}
