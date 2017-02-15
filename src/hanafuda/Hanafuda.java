package hanafuda;

import java.util.*;
import java.io.*;

public class Hanafuda {

    private static String language;
    private static TreeSet<Player> playerList = new TreeSet<>(new PlayerComparator());
    private static Player current;
    //although searching can be slower, I want it in descending score order
    
    public static void main(String[] args) throws FileNotFoundException {
        HomeScreen hs = new HomeScreen();
        TestPanel test = new TestPanel();
        test.setVisible(true);
        hs.setVisible(true);
        Card.createDeck();
        File settings = new File("Settings.txt");
        Hanafuda.getSettings(settings);
        Hanafuda.saveData(settings);
    }
    
    public static void getSettings(File settings) throws FileNotFoundException {
        Scanner scanLine = new Scanner(settings);
        language = scanLine.nextLine();
        while (scanLine.hasNextLine()) {
            String l = decrypt(scanLine.nextLine());
            Scanner scanTok = new Scanner(l);
            String name = scanTok.next() + " " + scanTok.next();
            int gamesWon = scanTok.nextInt();
            int highScore = scanTok.nextInt();
            playerList.add(new Player(name, gamesWon, highScore));
        }
    }
    
    public static void saveData(File settings) throws FileNotFoundException{
        PrintStream ps = new PrintStream(settings);
        ps.println(language);
        for (Player p: playerList) {
            ps.println(encrypt(p.toString()));
        }
    }
    
    public static boolean setPlayer(String name) {
        Iterator itr = playerList.iterator();
        while (itr.hasNext()) {
            Player temp = (Player) itr.next();
            if (temp.getName().equalsIgnoreCase(name)) {
                current = temp;
                System.out.println(" Current player set as " + current.getName());
                return true;
            }
        }
        return false;   
    }
    
    public static String encrypt(String word) {//doesnt have to wrap around
        String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
            encrypted += (char) (word.charAt(i) - 7);
        }
        return encrypted;
    }
    
    public static String decrypt(String encrypted) {
        String unknown = "";
        for (int i = 0; i < encrypted.length(); i++) {
            unknown += (char) (encrypted.charAt(i) + 7);
        }
        return unknown;
    }
}
