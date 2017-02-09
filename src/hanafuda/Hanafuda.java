package hanafuda;

import java.util.*;
import java.io.*;

public class Hanafuda {

    private static String language;
    private static TreeSet<Player> playerList = new TreeSet<>(new PlayerComparator());
    //although searching can be slower, I want it in descending score order
    
    public static void main(String[] args) throws FileNotFoundException {
        //HomeScreen hs = new HomeScreen();
        TestPanel test = new TestPanel();
        test.setVisible(true);
        //hs.setVisible(true);
        Card.createDeck();
        File settings = new File("Settings.txt");
        Hanafuda.getSettings(settings);
        Hanafuda.saveData(settings);
        
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
